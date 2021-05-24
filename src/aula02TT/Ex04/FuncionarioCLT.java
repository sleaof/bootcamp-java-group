package aula02TT.Ex04;

public class FuncionarioCLT {

    private String Cargo;
    private Integer qtdMetaBatida;
    private double bonus;
    private Integer horasSemanais;
    private Integer horasDescanso;
    private double salarioBase;

    public FuncionarioCLT(String cargo, Integer qtdMetaBatida, Double bonus, Integer horasSemanais, Integer horasDescanso, Double salarioBase) {
        Cargo = cargo;
        this.qtdMetaBatida = qtdMetaBatida;
        this.bonus = bonus;
        this.horasSemanais = horasSemanais;
        this.horasDescanso = horasDescanso;
        this.salarioBase = salarioBase;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String cargo) {
        Cargo = cargo;
    }

    public int getQtdMetaBatida() {
        return qtdMetaBatida;
    }

    public void setQtdMetaBatida(int qtdMetaBatida) {
        this.qtdMetaBatida = qtdMetaBatida;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getHorasSemanais() {
        return horasSemanais;
    }

    public void setHorasSemanais(int horasSemanais) {
        this.horasSemanais = horasSemanais;
    }

    public int getHorasDescanso() {
        return horasDescanso;
    }

    public void setHorasDescanso(int horasDescanso) {
        this.horasDescanso = horasDescanso;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(int salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void pagarSalario(){
        double salario = getSalarioBase() * ((getBonus() / 100) + getQtdMetaBatida() + 1);
        System.out.format("Total a pagar: %.2f%n", salario);
    }
}
