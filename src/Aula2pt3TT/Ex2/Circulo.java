package Aula2pt3TT.Ex2;

public class Circulo extends GeometricFigure {

    private final double pi = Math.PI;
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getPi() {
        return pi;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "pi=" + pi +
                ", raio=" + raio +
                '}';
    }

    @Override
    public double area() {
        double areaS;
        raio = getRaio() * getRaio();
        areaS = pi * raio;

        return areaS;
    }
}
