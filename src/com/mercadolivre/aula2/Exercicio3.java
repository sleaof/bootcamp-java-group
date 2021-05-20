package com.mercadolivre.aula2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);
        Produto produto;
        Double total = 0.0;

        for (int i = 0; i < 3; i++) {
            produto = new Produto();
            System.out.println("digite o nome do produto: ");
            produto.setNome(keyboard.next());

            System.out.println("digite o nome do valor: ");
            produto.setValor(keyboard.nextDouble());

            System.out.println("digite o nome do quantidade: ");
            produto.setQuantidade(keyboard.nextInt());

            produtos.add(produto);
        }

        for(Produto x: produtos) {
            total += x.getTotal();
        }

        System.out.println(total);
    }
}
