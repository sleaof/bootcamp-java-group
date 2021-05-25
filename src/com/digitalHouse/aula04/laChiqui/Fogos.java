package com.digitalHouse.aula04.laChiqui;

public class Fogos {

    private String barulho;

    public Fogos(String barulho) {
        this.barulho = barulho;
    }

    public void explodir() {
        System.out.println(this.barulho);
    }
}
