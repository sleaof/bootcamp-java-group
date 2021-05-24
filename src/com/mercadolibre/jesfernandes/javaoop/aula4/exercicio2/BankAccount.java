package com.mercadolibre.jesfernandes.javaoop.aula4.exercicio2;

public class BankAccount {

    double balance;
    Integer accountNumber;

    public BankAccount(){}

    public BankAccount(double balance, Integer accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public boolean deposit(double value){
        balance += value;
        return true;
    }

    public boolean withdraw(double value){
        if(this.balance >= value){
            this.balance -= value;
            return true;
        }
        return false;
    }

    public boolean giveBack(double value){
        return this.deposit(value);
    }

    public boolean transfer(BankAccount accountDestination, double value){
        if(this.balance >= value){
            this.balance -= value;
            accountDestination.deposit(value);
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }
}
