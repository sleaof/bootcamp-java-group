package com.digitalHouse.aula03.tm.aula05.exec01;

public class Celular implements Precedente<Celular> {
    private String number;
    public String holder;

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
        return (this.number).compareToIgnoreCase(celular.getNumber());
    }
}
