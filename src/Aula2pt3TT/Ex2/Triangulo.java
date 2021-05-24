package Aula2pt3TT.Ex2;

public class Triangulo extends GeometricFigure {

    private double altura;
    private double base;

    public Triangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "altura=" + altura +
                ", base=" + base +
                '}';
    }

    @Override
    public double area() {
        double areaT = getAltura() * getBase() / 2;
        return areaT;
    }
}
