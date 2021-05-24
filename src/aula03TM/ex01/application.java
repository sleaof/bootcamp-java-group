package aula03TM.ex01;


import java.util.Arrays;

public class application {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Gabriel", "212312", 23);
        Pessoa p2 = new Pessoa("Diego", "431232",29);
        Pessoa p3 = new Pessoa("Iolanda", "23232323",58);
        Pessoa p4 = new Pessoa("Raimundo Alves", "21332332", 60);
        Pessoa p5 = new Pessoa("Jessica","3232323",29);

        Pessoa[] pessoas = new Pessoa[5];
        pessoas[0] = p1;
        pessoas[1] = p2;
        pessoas[2] = p3;
        pessoas[3] = p4;
        pessoas[4] = p5;

        SortUtil.sort(pessoas);

        for (Pessoa p : pessoas){
            System.out.println(p);
        }

        Celular c1 = new Celular("212121", "H1");
        Celular c2 = new Celular("4343443", "H2");
        Celular c3 = new Celular("888888", "H3");

        Celular[] celulares = {c1,c2,c3};

        SortUtil.sort(celulares);

        for (Celular c : celulares){
            System.out.println(c);
        }

   }
}
