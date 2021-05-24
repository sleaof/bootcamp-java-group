package com.digitalHouse.aula02.tt.aula04.exec04;

public class FuncionarioCLT extends Funcionario{

    private String hierarquia;
    private double meta;

    public FuncionarioCLT(String hierarquia, double meta) {
        this.hierarquia = hierarquia;
        this.meta = meta;
    }

    @Override
    public double pagarSalario() {
        if(this.hierarquia.equals("Técnico")) {
            return ((3200 * 0.05) * this.meta) + 3200;
        } else if(this.hierarquia.equals("Analista")) {
            return ((4000 * 0.08) * this.meta) + 3200;
        } else if(this.hierarquia.equals("Gerente")) {
            return ((6000 * 0.125) * this.meta) + 3200;
        } else if(this.hierarquia.equals("Diretor")) {
            return (15000 * 0.03) + 3200;
        }
        return 0.0;
    }
}
