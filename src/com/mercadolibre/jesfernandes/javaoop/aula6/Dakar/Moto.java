package com.mercadolibre.jesfernandes.javaoop.aula6.Dakar;

public class Moto extends Veiculo {

    private static Double peso = 300.;
    private static Integer qtd = 2;

    public Moto(Double velocidade, Double aceleracao, Double anguloDeGiro, String placa) {
        super(velocidade, aceleracao, anguloDeGiro, placa, peso, qtd);
    }
}