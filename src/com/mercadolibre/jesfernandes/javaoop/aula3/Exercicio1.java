package com.mercadolibre.jesfernandes.javaoop.aula3;

//Desenvolva um programa para mostrar os primeiros n números pares,
//sendo n um valor que o usuário irá inserir pelo console.
//Lembre-se que um número é par quando divisível por 2.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List< Integer > listNumber = new ArrayList< >();

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                listNumber.add(i);
            }
        }

        System.out.println(listNumber);

    }
}
