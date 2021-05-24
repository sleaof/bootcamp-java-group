package Aula2pt4TT;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Funcionario {
    private String nome;
    private String tipoDeContratacao;
    private double salario;
    private String cargo;
    private double jornadaSemanal;

    public Funcionario(String nome, String tipoDeContratacao) {
        this.nome = nome;
        this.tipoDeContratacao = tipoDeContratacao;
    }

    public double getJornadaSemanal() {
        return jornadaSemanal;
    }

    public void setJornadaSemanal(double jornadaSemanal) {
        this.jornadaSemanal = jornadaSemanal;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoDeContratacao() {
        return tipoDeContratacao;
    }

    public void setTipoDeContratacao(String tipoDeContratacao) {


        this.tipoDeContratacao = tipoDeContratacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void bonificacao(){
        if (getTipoDeContratacao() == "PJ"){

        }
        if (getCargo() ==  "Técnico"){
           setSalario(salario/100*5);
        }
        if (getCargo() ==  "Analista"){
            setSalario(salario/100*8);
        }
        if (getCargo() ==  "Gerente"){
            setSalario(salario/100*12.5);
        }
        if (getCargo() ==  "Diretor"){
            setSalario(salario/100*3);
        }
    }

    public void pagarSalario(){

        if (getTipoDeContratacao() == "CLT" || getTipoDeContratacao() == "PJ"){
            int funcao;
            Scanner teclado = new Scanner(System.in);
            System.out.println("Selecione o numero correspondente a sua função:  \n 1 - Técnicos \n 2 - Analistas \n 3 - Gerentes \n 4 - Diretores");
            funcao = teclado.nextInt();

                if (funcao == 1 ){
                    setCargo("Técnico");
                    setSalario(3.200);
                    setJornadaSemanal(40);
                }else
                if (funcao == 2){
                    setCargo("Analista");
                    setSalario(4.000);
                    setJornadaSemanal(40);
                }else
                if (funcao == 3){
                    setCargo("Gerente");
                    setSalario(6.000);
                    setJornadaSemanal(36);
                }else
                if (funcao == 4){
                    setCargo("Diretor");
                    setSalario(15.000);
                    setJornadaSemanal(40);
                }
        }
    }


    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", tipoDeContratacao='" + tipoDeContratacao + '\'' +
                ", salario=" + salario +
                ", cargo='" + cargo + '\'' +
                ", jornadaSemanal=" + jornadaSemanal +
                '}';
    }

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Ricardo","CLT");
        f1.pagarSalario();
        System.out.println(f1.toString());

    }
}

