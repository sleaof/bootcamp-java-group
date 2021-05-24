package com.digitalHouse.aula02.tt.aula04.exec03.dois;

public class Circulo extends FiguraGeometrica{

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return (3.14 * Math.pow(this.raio, 2));
    }
}
