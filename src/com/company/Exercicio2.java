package com.company;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        //Desenvolva um programa para mostrar os primeiros n números múltiplos de m, sendo n e m valores que o
        // usuário irá inserir via console. Lembre-se que um número a é divisível por b se a é divisível por b.
        int n, m;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("digite um numero:");
        n = keyboard.nextInt();

        System.out.println("digite o multiplo:");
        m = keyboard.nextInt();

        for (int i = 0; i < n + 1; i++) {
            if(i % m == 0 && i != 0) {
                System.out.println(i);
            }
        }

    }
}
