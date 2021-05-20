package com.mercadolibre.jesfernandes;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        System.out.println("Programa para mostrar os números primos:");
        System.out.println("Informe um número:");
        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();

        Boolean valida = false;

        for (int i = 2; i < n; i++) {

            if (n % i == 0) {
                valida = true;
                break;
            }
        }

        if (valida) {
            System.out.printf("Número " + n + " nao é primo");
        } else {
            System.out.printf("Número " + n + " é primo");
        }
    }
}
