package com.mercadolibre.jesfernandes.javaoop.aula4.exercicio3.figurasGeometricas;

public abstract class GeometricFigure {

    public abstract double area ();

    @Override
    public String toString() {
        return String.format("Area da figura %s e %.2f", this.getClass().getSimpleName(), area());
    }

}
