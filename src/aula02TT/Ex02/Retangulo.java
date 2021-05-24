package aula02TT.Ex02;

public class Retangulo extends GeometricFigure {

    private double lado;
    private double altura;

    public Retangulo(){
    }

    public Retangulo(double lado, double altura) {
        this.lado = lado;
        this.altura = altura;
    }

    @Override
    public double area() {
        return lado * altura;
    }
}
