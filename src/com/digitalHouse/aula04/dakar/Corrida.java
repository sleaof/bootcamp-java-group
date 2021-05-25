package com.digitalHouse.aula04.dakar;

import java.util.ArrayList;
import java.util.List;

public class Corrida {

    private double distancia;
    private double premioEmDolares;
    private String nome;
    private int quantidadeVeiculosPermitidos;
    private List<Veiculo> listaVeiculos;
    SocorristaCarro socorristaCarro = new SocorristaCarro();
    SocorristaMoto socorristaMoto = new SocorristaMoto();

    public Corrida(double distancia, double premioEmDolares, String nome, int quantidadeVeiculosPermitidos, List<Veiculo> listaVeiculos) {
        this.distancia = distancia;
        this.premioEmDolares = premioEmDolares;
        this.nome = nome;
        this.quantidadeVeiculosPermitidos = quantidadeVeiculosPermitidos;
        this.listaVeiculos = listaVeiculos;
    }

    public void registrarCarro(double velocidade, int aceleracao, int anguloDeGiro, String placa) {
        if (quantidadeVeiculosPermitidos > 0) {
            listaVeiculos.add(new Carro(velocidade, aceleracao, anguloDeGiro, placa));
            quantidadeVeiculosPermitidos--;
        } else {
            System.out.println("Não há mais vagas disponíveis");
        }
    }

    public void registrarMoto(double velocidade, int aceleracao, int anguloDeGiro, String placa) {
        if (quantidadeVeiculosPermitidos > 0) {
            listaVeiculos.add(new Moto(velocidade, aceleracao, anguloDeGiro, placa));
            quantidadeVeiculosPermitidos--;
        } else {
            System.out.println("Não há mais vagas disponíveis");
        }
    }

    public void removerVeiculo(Veiculo veiculo) {
        boolean encontrado = false;
        for (Veiculo v : listaVeiculos) {
            if (v.getPlaca().equals(veiculo.getPlaca())) {
                listaVeiculos.remove(v);
                quantidadeVeiculosPermitidos++;
                System.out.println("Veículo removido com sucesso");
                encontrado = true;
            }
        }

        if (encontrado == false) {
            System.out.println("Veículo não encontrado");
        }
    }

    public void removerVeiculoPorPlaca(String placa) {
        boolean encontrado = false;
        for (Veiculo v : listaVeiculos) {
            if (v.getPlaca().equals(placa)) {
                listaVeiculos.remove(v);
                quantidadeVeiculosPermitidos++;
                System.out.println("Veículo removido com sucesso");
                encontrado = true;
            }
        }

        if (encontrado == false) {
            System.out.println("Veículo não encontrado");
        }
    }

    public Veiculo calcularVencedor() {
        List<Double> resultado = new ArrayList<>();
        double maior = 0;

        for (Veiculo v : listaVeiculos) {
            resultado.add((v.getVelocidade() * v.getAceleracao()) / (v.getAnguloDeGiro() * (v.getPeso() - v.getRodas() * 100)));
        }

        Veiculo veiculo = null;
        for (int i = 0; i < resultado.size(); i++) {
            if(resultado.get(i) > maior) {
                maior = resultado.get(i);
                veiculo = listaVeiculos.get(i);
            }
        }
        return veiculo;
    }

    public void socorrerCarro(String documento) {
        for(Veiculo v : listaVeiculos) {
            if(v.getPlaca().equals(documento)) {
                socorristaCarro.socorrer(v);
            }
        }
    }

    public void socorrerMoto(String documento) {
        for(Veiculo v : listaVeiculos) {
            if(v.getPlaca().equals(documento)) {
                socorristaMoto.socorrer(v);
            }
        }
    }
}
