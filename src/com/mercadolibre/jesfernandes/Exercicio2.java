package com.mercadolibre.jesfernandes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        System.out.println("Programa para mostrar os numeros multiplos:");
        System.out.println("Informe um número maior que 0:");
        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();

        System.out.println("Informe um multiplo:");
        Integer m = scanner.nextInt();

        List<Integer> listaNumeros = new ArrayList<>();

        for(int i = 0; i <= m; i++){
            if(i % n  == 0){
                listaNumeros.add(i);
            }
        }

        System.out.println("Sao números multiplos:");
        System.out.println(listaNumeros);

    }
}
