package com.company;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        //Desenvolva um programa para mostrar por console os primeiros n números primos, sendo um
        // valor que o usuário irá inserir pelo console.

        int n, divisiveis = 0, i = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("digite um numero:");
        n = keyboard.nextInt();

        while(i < n + 1) {
            for (int j = 0; j < i + 1; j++) {
                if(j != 0 && i % j == 0) {
                    divisiveis = divisiveis + 1;
                }
            }

            if(i != 0 && i % 1 == 0 && i % i == 0 && divisiveis == 2) {
                System.out.println(i);
            }

            divisiveis = 0;
            i++;
        }
    }
}
