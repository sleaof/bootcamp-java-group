package com.mercadolibre.jesfernandes.javaoop.aula4.exercicio3.figurasGeometricas;

public class Circulo extends GeometricFigure{

    private double raio;
    private double pi = 3.14159;

    public double area() {
        double area = (raio*raio)*pi;
        area = Double.parseDouble(String.format("%.4f", area));
        return area;
    }
}
