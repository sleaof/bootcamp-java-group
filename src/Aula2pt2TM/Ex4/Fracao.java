package Aula2pt2TM.Ex4;

import java.util.Scanner;

public class Fracao {
    private int numerador;
    private int denominador;
    private int operador;


    public Fracao(int num, int den, int ops) {
        numerador = num;
        denominador = den;
        operador = ops;
    }

    public void operacao(int x, int y) {
        if (operador == 1){
            numerador = numerador * y;
            denominador = denominador * x;
            System.out.println(numerador + "/" + denominador);
            System.out.println("Multiplicação");
        }
    }

    public void operacao(int x, int y, int z) {
        if (operador == 2){
            numerador = numerador / y;
            denominador = denominador / x;
            System.out.println(numerador + "/" + denominador);
            System.out.println("Divisão");
        }
    }

    public void operacao(int x, int y, int z,int k) {
        if (operador == 3) {
            numerador = numerador - y;
            denominador = denominador - x;
            System.out.println(numerador + "/" + denominador);
            System.out.println("Subtração");
        }
    }
    public void operacao(int x, int y, boolean z) {
        if (operador == 4) {
            numerador = numerador + y;
            denominador = denominador + x;
            System.out.println(numerador + "/" + denominador);
            System.out.println("Adição");
        }
    }


    public static void main(String args[]) {
        int num, den;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("informe o numerador: ");
        num = keyboard.nextInt();

        Scanner teclado = new Scanner(System.in);
        System.out.println("informe o denominador: ");
        den = teclado.nextInt();

        int op;

        Scanner inserir = new Scanner(System.in);
        System.out.println("Informe um numero: \n 1 - Multiplicar \n 2 - Dividir \n 3 - Subtrair \n 4 - somar");
        op = inserir.nextInt();

        Fracao dados = new Fracao(num, den, op);

        int y;
        Scanner inserirNum1 = new Scanner(System.in);
        System.out.println("informe o numerador: ");
        y = inserirNum1.nextInt();

        int x;
        Scanner inserirNum2 = new Scanner(System.in);
        System.out.println("informe o denominador: ");
        x = inserirNum2.nextInt();

        int z = 0;
        int k = 0;
        dados.operacao(x, y);
        dados.operacao(x,y,z);
        dados.operacao(x,y,z,k);
        dados.operacao(x,y,true);
    }





}
