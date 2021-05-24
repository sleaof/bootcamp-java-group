package com.company;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        int m;
        int n;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Entre com o numero m de 1 a 100 ");
        m = teclado.nextInt();

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Entre com o numero n de 1 a 100");
        n = keyboard.nextInt();

        n = n + m;

        while (n < 100) {
            System.out.println(n);
            n = n + m;
        }
    }
}