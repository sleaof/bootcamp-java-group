package com.digitalHouse.aula03.tt.aula05.exec03;

public class Personagem {

    private String nome;
    private Classe classe;
    private int nivel;
    private Arma arma;

    public Personagem(String nome, Classe classe, int nivel, Arma arma) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.arma = arma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }
}
