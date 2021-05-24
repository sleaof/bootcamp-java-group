package com.mercadolibre.jesfernandes.javaoop.aula4.exercicio3.figurasGeometricas;

public class Triangulo extends GeometricFigure{

    private double base;
    private double altura;

    public double area() {
        double area = base*altura/2;
        area = Double.parseDouble(String.format("%.4f", area));
        return area;
    }
}
