package com.digitalHouse.aula01.tm.aula03.exec01;

import java.util.Scanner;

public class Main {

    public static void exercicio01(Scanner scanner) {
        System.out.println("Exercicio 01");
        System.out.println("01. Digite um valor: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            if ((i % 2) == 0)
                System.out.println("O numero " + i + " e par");
            else
                System.out.println("O numero " + i + " e impar");
        }
    }

    public static void exercicio02(Scanner scanner) {
        System.out.println("Exercicio 02");
        System.out.println("02. Digite um valor para n: ");
        int n = scanner.nextInt();
        System.out.println("02. Digite um valor para m: ");
        int m = scanner.nextInt();

        for (int i = 1; i < n + 1; i++) {
            if ((i % m) == 0)
                System.out.println(i);
        }
    }

    public static boolean primo(int n) {
        for (int i = 2; i < n; i++) {
            if ((n % i) == 0)
                return false;
        }
        return true;
    }

    public static void exercicio03(Scanner scanner) {
        System.out.println("Exercicio 03");
        System.out.println("03. Digite um valor para n: ");
        int n = scanner.nextInt();

        if (primo(n) == true) {
            System.out.println("O numero " + n + " e primo");
        } else {
            System.out.println("O numero " + n + " nao e primo");
        }
    }

    public static void exercicio04(Scanner scanner) {
        System.out.println("Exercicio 04");
        System.out.println("04. Digite um valor para n: ");
        int n = scanner.nextInt();

        for (int i = 2; i <= n; i++) {
            if (primo(i) == true) {
                System.out.println("O numero " + i + " e primo");
            } else {
                System.out.println("O numero " + i + " nao e primo");
            }
        }
    }

    public static void exercicio05(Scanner scanner) {
        System.out.println("Exercicio 05");
        System.out.println("05. Digite um valor para n: ");
        int n = scanner.nextInt();
        System.out.println("05. Digite um valor para m: ");
        int m = scanner.nextInt();
        System.out.println("05. Digite um valor para d: ");
        int d = scanner.nextInt();

        int counterN = 0;
        int numero = 0;

        while (counterN != n) {
            int counterM = 0;
            numero += 1;
            String sequencia = String.valueOf(numero);
            for (int i = 0; i < sequencia.length(); i++) {
                char ch = sequencia.charAt(i);
                if (Character.getNumericValue(ch) == d) {
                    counterM++;
                }
            }

            if (counterM >= m) {
                System.out.println(numero);
                counterN++;
            }
        }

    }
}
