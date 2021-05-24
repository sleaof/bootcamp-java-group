package com.mercadolibre.jesfernandes.javaoop.aula4.exercicio3.figurasGeometricas;

public class Retangulo extends GeometricFigure{

    private double ladoA;
    private double ladoB;

    public double area() {
        double area = ladoA*ladoB;
        area = Double.parseDouble(String.format("%.4f", area));
        return area;
    }
}
