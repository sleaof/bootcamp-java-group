package com.mercadolibre.jesfernandes.javaoop.aula5.exercicio1;

public class Pessoa implements Precedente<Pessoa>{

    String name;
    String cpf;

    public Pessoa(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public int precedeA(Pessoa p) {
        return this.cpf.compareTo(p.cpf);
    }
}
