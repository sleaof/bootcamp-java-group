package com.digitalHouse.aula02.tm.aula04.exec02.dois;

public class Counter {

    private int valor;

    public Counter() { }

    public Counter(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void aumentar() {
        this.valor += 1;
    }

    public void diminuir() {
        this.valor -= 1;
    }
}
