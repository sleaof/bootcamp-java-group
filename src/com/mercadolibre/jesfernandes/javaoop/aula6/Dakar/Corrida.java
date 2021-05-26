package com.mercadolibre.jesfernandes.javaoop.aula6.Dakar;

import java.util.ArrayList;
import java.util.List;

public class Corrida {

    protected Double distancia;
    protected Double premioEmDolares;
    protected String nome;
    protected Integer quantidadeVeiculosPermitidos;
    protected List<Veiculo> listaVeiculos = new ArrayList<>();
    protected SocorristaCarro socorristaCarro = new SocorristaCarro();
    protected SocorristaMoto socorristaMoto = new SocorristaMoto();

    public Corrida(Double distancia, Double premioEmDolares, String nome, Integer quantidadeVeiculosPermitidos, SocorristaCarro socorristaCarro, SocorristaMoto socorristaMoto) {
        this.distancia = distancia;
        this.premioEmDolares = premioEmDolares;
        this.nome = nome;
        this.quantidadeVeiculosPermitidos = quantidadeVeiculosPermitidos;
        this.socorristaCarro = socorristaCarro;
        this.socorristaMoto = socorristaMoto;
    }

    public Double getDistancia() {
        return distancia;
    }

    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }

    public Double getPremioEmDolares() {
        return premioEmDolares;
    }

    public void setPremioEmDolares(Double premioEmDolares) {
        this.premioEmDolares = premioEmDolares;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidadeVeiculosPermitidos() {
        return quantidadeVeiculosPermitidos;
    }

    public void setQuantidadeVeiculosPermitidos(Integer quantidadeVeiculosPermitidos) {
        this.quantidadeVeiculosPermitidos = quantidadeVeiculosPermitidos;
    }

    public List<Veiculo> getListaVeiculos() {
        return listaVeiculos;
    }

    public void setListaVeiculos(List<Veiculo> listaVeiculos) {
        this.listaVeiculos = listaVeiculos;
    }
}
