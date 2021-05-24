package aula02TT.Ex02;

import aula02TT.Ex02.GeometricFigure;

public class Triangulo extends GeometricFigure {

    private Double altura;
    private Double base;

    public Triangulo(){

    }

    public Triangulo(Double altura, Double base) {
        this.altura = altura;
        this.base = base;
    }

    @Override
    public double area() {
        return (base * altura)/2;
    }
}
