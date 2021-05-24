package aula02TT.Ex04;

public class FuncionarioPJ{

    private String cargo;
    private Integer horaTrabalhada;
    private Double pagamentoHora;

    public FuncionarioPJ(String cargo, Integer horaTrabalhada, Double pagamentoHora) {
        this.cargo = cargo;
        this.horaTrabalhada = horaTrabalhada;
        this.pagamentoHora = pagamentoHora;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Integer getHoraTrabalhada() {
        return horaTrabalhada;
    }

    public void setHoraTrabalhada(Integer horaTrabalhada) {
        this.horaTrabalhada = horaTrabalhada;
    }

    public Double getPagamentoHora() {
        return pagamentoHora;
    }

    public void setPagamentoHora(Double pagamentoHora) {
        this.pagamentoHora = pagamentoHora;
    }

    public void pagarSalario(){
        double salario = getHoraTrabalhada() + getPagamentoHora();
        System.out.format("Total a pagar: %.2f%n", salario);
    }
}
