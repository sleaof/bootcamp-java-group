package com.mercadolibre.jesfernandes.javaoop.aula3;

//Desenvolva um programa para mostrar por console os primeiros n números primos,
//sendo um valor que o usuário irá inserir pelo console.

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 2; n > 0; i++) {
            if (verifyIsCousin(i)) {
                System.out.println(i);
                n--;
            }
        }
    }

    public static boolean verifyIsCousin(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
