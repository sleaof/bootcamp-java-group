package com.company;

import java.util.Scanner;

public class Exercicio3 {

    public static boolean isPrimo(int n){
        for (int i = 2; i < n; i++){
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Entre com o numero n de 1 a 100 ");
        n = teclado.nextInt();

        boolean result = isPrimo(n);
        if (result == true) {
            System.out.println("O numero que você digitou é primo");
        } else {
            System.out.println("O numero que você digitou não é primo");
        }
    }
}
