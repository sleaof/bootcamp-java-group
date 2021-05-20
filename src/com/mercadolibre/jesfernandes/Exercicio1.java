package com.mercadolibre.jesfernandes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        System.out.println("Programa para mostrar os primeiros n números pares:");
        System.out.println("Informe um número:");
        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();

        List < Integer > listaNumeros = new ArrayList < > ();

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                listaNumeros.add(i);
            }
        }

        System.out.println("Sao números pares:");
        System.out.println(listaNumeros);

    }

}