package com.mercadolibre.jesfernandes;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        System.out.println("Programa para mostrar os números primos:");
        System.out.println("Informe um número:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 2; n > 0; i++) {
            if (validaPrimo(i)) {
                System.out.println(i);
                n--;
            }
        }
    }

    public static boolean validaPrimo(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
