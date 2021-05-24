package Aula2pt2TM.EX1;

public class ContaCorrente {
    private String correntista;
    private int numeroConta;
    private int saldo;

    public ContaCorrente() {

    }

    public ContaCorrente(String correntista, int numeroConta, int saldo) {
        this.correntista = correntista;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public ContaCorrente(ContaCorrente contaCorrente) {
        this.correntista = contaCorrente.getCorrentista();
        this.numeroConta = contaCorrente.getNumeroConta();
        this.saldo = contaCorrente.getSaldo();
    }

    public void deposito() {

    }

    public void saque() {

    }

    public void devolução() {

    }

    public void transferencia() {

    }

    public String getCorrentista() {
        return correntista;
    }

    public void setCorrentista(String correntista) {
        this.correntista = correntista;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
