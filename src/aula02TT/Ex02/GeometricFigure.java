package aula02TT.Ex02;

public  abstract class  GeometricFigure {

    public abstract double area();

    @Override
    public String toString() {
        return "Área" + String.format(" %.2f", area());
    }
}
