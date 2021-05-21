package com.digitalHouse.aula02.tm.aula04.exec02.quatro;

public class Fracao {

    public double adicionar(double xNumerador, double xDenominador, double yNumerador){
        return (xNumerador / xDenominador) + yNumerador;
    }

    public double subtrair(double xNumerador, double xDenominador, double yNumerador){
        return (xNumerador / xDenominador) - yNumerador;
    }

    public double multiplicar(double xNumerador, double xDenominador, double yNumerador){
        return (xNumerador / xDenominador) + yNumerador;
    }

    public double dividir(double xNumerador, double xDenominador, double yNumerador){
        return (xNumerador / xDenominador) / yNumerador;
    }

    public double adicionar(String xNumerador, String xDenominador, String yNumerador){
        return (Double.parseDouble(xNumerador) / Double.parseDouble(xDenominador)) + Double.parseDouble(yNumerador);
    }

    public double subtrair(String xNumerador, String xDenominador, String yNumerador){
        return (Double.parseDouble(xNumerador) / Double.parseDouble(xDenominador)) - Double.parseDouble(yNumerador);
    }

    public double multiplicar(String xNumerador, String xDenominador, String yNumerador){
        return (Double.parseDouble(xNumerador) / Double.parseDouble(xDenominador)) * Double.parseDouble(yNumerador);
    }

    public double dividir(String xNumerador, String xDenominador, String yNumerador){
        return (Double.parseDouble(xNumerador) / Double.parseDouble(xDenominador)) / Double.parseDouble(yNumerador);
    }
}
