package com.digitalHouse.aula04.laChiqui;

public class ConvidadoMeli extends Convidado{

    private String nome;

    public ConvidadoMeli(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void gritar() {
        System.out.println("Viva la Chiqui !!");
    }
}
