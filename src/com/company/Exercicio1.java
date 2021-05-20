package com.company;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        //Desenvolva um programa para mostrar os primeiros n números pares, sendo n um valor que o usuário irá
        //inserir pelo console. Lembre-se que um número é par quando divisível por 2.

        int n, i = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("digite um numero:");
        n = keyboard.nextInt();

        while(i < n + 1) {
            if(i % 2 == 0 && i != 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
