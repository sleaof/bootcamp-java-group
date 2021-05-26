package com.mercadolibre.jesfernandes.javaoop.aula6.Dakar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CorridaImpl extends Corrida{


    public CorridaImpl(Double distancia, Double premioEmDolares, String nome, Integer quantidadeVeiculosPermitidos, SocorristaCarro socorristaCarro, SocorristaMoto socorristaMoto) {
        super(distancia, premioEmDolares, nome, quantidadeVeiculosPermitidos, socorristaCarro, socorristaMoto);
    }

    public void registraCarro(Double velocidade, Double aceleracao, Double anguloDeGiro, String patente) {
        if(listaVeiculos.size() > quantidadeVeiculosPermitidos - 1) {
            System.out.println("Corrida de carro está completa");
        } else {
            System.out.println("Registrando carro na corrida.");
            listaVeiculos.add(new Carro(velocidade, aceleracao, anguloDeGiro, patente));
        }
    }

    public void registraMoto(Double velocidade, Double aceleracao, Double anguloDeGiro, String patente) {
        if(listaVeiculos.size() > this.quantidadeVeiculosPermitidos - 1) {
            System.out.println("Corrida de moto está completa");
        } else {
            System.out.println("Registrando moto na corrida.");
            listaVeiculos.add(new Moto(velocidade, aceleracao, anguloDeGiro, patente));
        }
    }

    public void removerVeiculo(Veiculo veiculo) {
        try {
            System.out.println("Removendo véiculo: " + veiculo.getPlaca());
            this.listaVeiculos.remove(veiculo);
            System.out.println("Veículo removido");
        } catch (IllegalArgumentException ex){
            System.out.println(veiculo.getPlaca() + " placa nao encontrada.");
        }
    }

    public void RemoverVeiculoPorPlaca(String placa) {
        for(Veiculo veiculo : this.listaVeiculos){
            try {
                if(veiculo.getPlaca().equalsIgnoreCase(placa)) {
                    System.out.println("Removendo véiculo por placa: " + veiculo.getPlaca());
                    this.listaVeiculos.remove(veiculo);
                    System.out.println("Veículo removido");
                }
            } catch (IllegalArgumentException ex){
                System.out.println(veiculo.getPlaca() + " placa nao encontrada.");
            }
        }
    }

    public Veiculo mostraVencedor(){
        List<Double> vencedor = listaVeiculos.stream().map(v -> 1 / 2.0 * v.getVelocidade() * v.getAceleracao()
                / (v.getAnguloDeGiro() * (v.getPeso() - v.getRodas() * 100))).collect(Collectors.toList());
        return this.listaVeiculos.get(vencedor.indexOf(Collections.max(vencedor)));
    }

    public void socorrerCarro(String placa) {
        try {
            Carro carro = (Carro) this.listaVeiculos.stream().filter(veiculo -> veiculo.getPlaca().equalsIgnoreCase(placa)).findFirst().get();
            socorristaCarro.socorrer(carro);
        } catch (IllegalArgumentException ex){
            System.out.println(placa + " placa nao encontrada.");
        }
    }

    public void socorrerMoto(String placa) {
        try {
            Moto moto = (Moto) this.listaVeiculos.stream().filter(veiculo -> veiculo.getPlaca().equalsIgnoreCase(placa)).findFirst().get();
            socorristaMoto.socorrer(moto);
        } catch (IllegalArgumentException ex){
            System.out.println(placa + " placa nao encontrada.");
        }
    }

}
