package com.mercadolibre.jesfernandes.javaoop.aula6.Dakar;

public class Carro extends Veiculo {

    static Double peso = 1000.00;
    static Integer qtdRodas = 4;

    public Carro(Double velocidade, Double aceleracao, Double anguloDeGiro, String placa) {
        super(velocidade, aceleracao, anguloDeGiro, placa, peso, qtdRodas);
    }

}
