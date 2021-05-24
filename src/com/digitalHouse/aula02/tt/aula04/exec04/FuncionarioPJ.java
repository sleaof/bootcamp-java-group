package com.digitalHouse.aula02.tt.aula04.exec04;

public class FuncionarioPJ extends Funcionario{

    private int horasTrabalhadas;
    private double valorPorHora;

    public FuncionarioPJ(int horasTrabalhadas, double valorPorHora) {
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }

    @Override
    public double pagarSalario() {
        return (this.horasTrabalhadas * this.valorPorHora);
    }
}
