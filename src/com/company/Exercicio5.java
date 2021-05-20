package com.company;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        //Desenvolver um programa para exibição por console os n primeiros números naturais que têm pelo
        //menos de m dígitos de d, sendo n, m e d valores que o utilizador vai entrar pela consola.
        //Por exemplo: se o usuário inserir n = 5, m = 2 e d = 3, o programa deve exibir os primeiros 5
        //números naturais que tenham pelo menos 2 dígitos 3 no console. Neste caso, a saída será: 33, 133,
        //233, 303, 313.
        //Dependendo de como você decidir abordar a solução para este exercício, pode ser necessário usar
        //recursos que ainda não estudamos. O desafio é pesquisar no Google como usar esses recursos e usá-los!

        int n, m, d;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("digite a quantidade de numeros:");
        n = keyboard.nextInt();

        System.out.println("digite o numero que deve aparecer:");
        d = keyboard.nextInt();

        System.out.println("digite a quantidade de vezes que o numero vai aparecer:");
        m = keyboard.nextInt();

        
    }
}
