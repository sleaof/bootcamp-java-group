package com.company;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        //Desenvolva um programa para informar se um um número n é primo ou não, sendo n um valor que o
        // usuário irá inserir pelo console. Lembre-se que um número é primo quando só é divisível por 1
        // e por si mesmo.

        int n, divisiveis = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("digite um numero:");
        n = keyboard.nextInt();

        for (int i = 0; i < n + 1; i++) {
            if(i != 0 && n % i == 0) {
                divisiveis = divisiveis + 1;
            }
        }

        if(n % 1 == 0 && n % n == 0 && divisiveis == 2) {
            System.out.println("numero primo");
        } else {
            System.out.println("nao é numero primo");
        }
    }
}
