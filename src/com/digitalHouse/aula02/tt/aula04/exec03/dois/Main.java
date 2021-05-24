package com.digitalHouse.aula02.tt.aula04.exec03.dois;

public class Main {
    public static void main(String[] args) {
        double figuraGeometrica[] = new double[3];

        figuraGeometrica[0] = new Triangulo(3.0, 2.0).area();
        figuraGeometrica[1] = new Circulo(3.0).area();
        figuraGeometrica[2] = new Retangulo(3.0, 2.0).area();

        System.out.println(areaMedia(figuraGeometrica));
    }

    public static double areaMedia(double arr[]) {
        double soma = 0;

        for (int i = 0; i < arr.length; i++) {
            soma += arr[i];
        }

        return soma/arr.length;
    }
}
