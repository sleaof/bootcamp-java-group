package com.mercadolibre.jesfernandes.javaoop.aula5.exercicio1;

public class Celular implements Precedente<Celular>{

    String number;
    String holder;

    public Celular(String number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    @Override
    public int precedeA(Celular celular) {
        return this.number.compareTo(celular.number);
    }
}
