package com.digitalHouse.aula02.tm.aula04.exec02.um;

public class ContaCorrente {

    public Cliente titular;
    private long agencia;
    private long numeroConta;
    private double saldo;

    public ContaCorrente() { }

    public ContaCorrente(Cliente titular, long agencia, long numeroConta, double saldo) {
        this.titular = titular;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public ContaCorrente(ContaCorrente contaCorrente) {
        this.titular = contaCorrente.getTitular();
        this.agencia = contaCorrente.getAgencia();
        this.numeroConta = contaCorrente.getNumeroConta();
        this.saldo = contaCorrente.getSaldo();
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public long getAgencia() {
        return agencia;
    }

    public void setAgencia(long agencia) {
        this.agencia = agencia;
    }

    public long getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(long numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if(valor < 0) {
            this.saldo += valor;
        } else {
            System.out.println("Valor inferior a 0");
        }
    }

    public void devolver(double valor) {
        if(valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("Limite indisponível para devolução");
        }
    }

    public void transferir(double valor, ContaCorrente contaDestino) {
        if(valor <= this.saldo) {
            this.saldo -= valor;
            contaDestino.depositar(valor);
        } else {
            System.out.println("Limite indisponível para transferência");
        }
    }

    public void sacar(double valor) {
        if(valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("Limite indisponível para saque");
        }
    }
}
