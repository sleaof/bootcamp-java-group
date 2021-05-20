package com.mercadolivre.aula2;

import java.util.ArrayList;
import java.util.List;

public class Exercicio2 {
    public static void main(String[] args) {
        List<Double> empresaX = new ArrayList<>();
        List<Double> empresaY = new ArrayList<>();
        int i = 0;
        int ano = 2021;

        empresaX.add(1.13);
        empresaY.add(18.4);

        do {
            empresaX.add(empresaX.get(i) + empresaX.get(i) * 1.48);
            empresaY.add(empresaY.get(i) + empresaY.get(i) * 0.32);

            System.out.format("Empresa X - 01/01/%d - Valor da Empresa X %.2fm\n", (ano + i), empresaX.get(i));
            System.out.format("Empresa Y - 01/01/%d - Valor da Empresa Y %.2fm\n", (ano + i), empresaY.get(i));

            i++;
        } while (empresaX.get(i) < empresaY.get(i));
    }
}
