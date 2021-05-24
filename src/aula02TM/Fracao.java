package aula02TM;

public class Fracao {
    public  static double somar(String f1, String f2){
        double n1 = transformFracao(f1);
        double n2 = transformFracao(f2);
        return (n1 + n2);
    }
    public static double subtrair(String f1, String f2){
        double n1 = transformFracao(f1);
        double n2 = transformFracao(f2);
        return n1 - n2;
    }

    public static double multiplicar(String f1, String f2){
        double n1 = transformFracao(f1);
        double n2 = transformFracao(f2);
        return n1 * n2;
    }

    public static double dividir(String f1, String f2){
        double n1 = transformFracao(f1);
        double n2 = transformFracao(f2);
        return  n1 / n2;
    }

    public static double somar(String f1, int n2){
        double n1 = transformFracao(f1);
        return n1 + n2;
    }

    public static double subtrair(String f1, int n2){
        double n1 = transformFracao(f1);
        return n1 - n2;
    }

    public static double multiplicar(String f1, int n2){
        double n1 = transformFracao(f1);
        return n1 * n2;
    }

    public static double dividir(String f1, int n2){
        double n1 = transformFracao(f1);
        return n1 / n2;
    }

    public static double somar(double n1, int n2){
        return n1 + n2;
    }

    public static double subtrair(double n1, int n2){
        return n1-n2;
    }

    public static double multiplicar(double n1, int n2){
        return n1-n2;
    }

    public static double dividir(double n1, int n2){
        return n1/n2;
    }

    public static double somar(double n1, double n2){
        return n1 + n2;
    }

    public static double subtrair(double n1, double n2){
        return n1-n2;
    }

    public static double multiplicar(double n1, double n2){
        return n1-n2;
    }

    public static double dividir(double n1, double n2){
        return n1/n2;
    }



    public static double transformFracao(String f){
        //Pega o string e coloca em um array
        String[] vect = f.split("/");
        return Double.valueOf(vect[0]) / Double.valueOf(vect[1]);
    }



}
