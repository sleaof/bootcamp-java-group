package com.company;

public class Exercicio1 {


    /* Integer m, n, d;
       Scanner teclado = new Scanner(System.in);
      System.out.println("Entre com o numero m de 1 a 2 ");
       m = teclado.nextInt();

       Scanner keyboard = new Scanner(System.in);
        System.out.println("Entre com o numero n de 1 a 9");
       n = keyboard.nextInt();

        Scanner digitar = new Scanner(System.in);
        System.out.println("Entre com o numero d de 1 a 9");
        d = digitar.nextInt();*/

    // Integer[] quant = new Integer[n];

    static int busca(){
        for (int i = 0; i < 999; i++){
        String[] num = (i + "").split(i+"");


        //String num = i + "";

        System.out.println(num[0] + " " + num[1]);

        //i = (i%1000)/100;
        //n = (i%100)/10;
        // d = i%10;
    }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(busca());
    }
}
