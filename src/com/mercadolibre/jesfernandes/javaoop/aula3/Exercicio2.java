package com.mercadolibre.jesfernandes.javaoop.aula3;

//Desenvolva um programa para mostrar os primeiros n números múltiplos de m,
//sendo n e m valores que o usuário irá inserir via console.
//Lembre-se que um número a é divisível por b se a é divisível por b.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();
        Integer m = scanner.nextInt();

        List<Integer> listNumber = new ArrayList<>();

        for(int i = 0; i <= m; i++){
            if(i % n  == 0){
                listNumber.add(i);
            }
        }

        System.out.println(listNumber);

    }
}
