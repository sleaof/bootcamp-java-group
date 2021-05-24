package com.mercadolibre.jesfernandes.javaoop.aula4.exercicio2;

public class Counter {

    Integer number;

    public Counter(){}

    public Counter(Integer number) {
        this.number = number;
    }

    public Integer increment(Integer number){
        return number++;
    }

    public Integer decrement(Integer number){
        return number--;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
