package aula02TT.Ex02;

public class Circulo extends GeometricFigure{

    private final Double pi = Math.PI;
    private Double raio;

    public Circulo(){
    }

    public Circulo (Double raio){
        this.raio = raio;
    }

    @Override
    public double area() {
        return pi * Math.pow(raio,2);
    }
}
