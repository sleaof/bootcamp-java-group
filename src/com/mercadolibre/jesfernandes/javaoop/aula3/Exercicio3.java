package com.mercadolibre.jesfernandes.javaoop.aula3;

//Desenvolva um programa para informar se um um número n é primo ou não,
//sendo n um valor que o usuário irá inserir pelo console.
//Lembre-se que um número é primo quando só é divisível por 1 e por si mesmo.

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();
        Boolean verify = false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                verify = true;
                break;
            }
        }

        if (verify) {
            System.out.printf("Número " + n + " nao é primo");
        } else {
            System.out.printf("Número " + n + " é primo");
        }

    }
}
