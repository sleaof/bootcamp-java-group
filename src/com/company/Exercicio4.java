package com.company;

import java.util.Scanner;

public class Exercicio4 {

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

            boolean result;
        for (int i = 0; i <= n; i++){

            int num = i;
            //System.out.println("saida do i " + i);
            result = isPrimo(num);
            //System.out.println(result);
            if (result == true) {
                System.out.println( num + " é primo" );
            }else{
                System.out.println( num + " não é primo");
            }
        }
    }
}
