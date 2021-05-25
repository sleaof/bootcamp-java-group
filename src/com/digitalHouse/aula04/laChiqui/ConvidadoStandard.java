package com.digitalHouse.aula04.laChiqui;

public class ConvidadoStandard extends Convidado{

    private String nome;

    public ConvidadoStandard(String nome) {
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
        System.out.println("");
    }
}
