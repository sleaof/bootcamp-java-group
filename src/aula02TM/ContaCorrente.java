package aula02TM;

import java.util.Objects;

public class ContaCorrente {

    private String correntista;
    private String numeroConta;
    private Double saldo;

    public ContaCorrente(){
    }

    public ContaCorrente(String correntista, String numeroConta, Double saldo) {
        this.correntista = correntista;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public ContaCorrente(ContaCorrente contaCorrente){
        this.correntista = contaCorrente.getCorrentista();
        this.numeroConta = contaCorrente.getNumeroConta();
        this.saldo = contaCorrente.getSaldo();
    }

    public String getCorrentista() {
        return correntista;
    }

    public void setCorrentista(String correntista) {
        this.correntista = correntista;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContaCorrente that = (ContaCorrente) o;
        return Objects.equals(correntista, that.correntista) && Objects.equals(numeroConta, that.numeroConta) && Objects.equals(saldo, that.saldo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(correntista, numeroConta, saldo);
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "correntista='" + correntista + '\'' +
                ", numeroConta='" + numeroConta + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
