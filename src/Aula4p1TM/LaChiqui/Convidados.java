package Aula4p1TM.LaChiqui;

import java.util.ArrayList;
import java.util.List;

public class Convidados {
    private String nome;
    private Fogos fogos;

    public Convidados(String nome, Fogos fogos) {
        this.nome = nome;
        this.fogos = fogos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Convidados{" +
                "nome='" + nome + '\'' +
                ", fogos=" + fogos +
                '}';
    }
}

