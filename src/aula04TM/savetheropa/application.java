package aula04TM.savetheropa;

import aula03TM.ex01.SortUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class application {
    public static void main(String[] args) {

        List<Vestuario> cliente1 = new ArrayList<>();
        List<Vestuario> cliente2 = new ArrayList<>();
        //HashMap<GuardaRoupa, Vestuario> guardaRoupa = new HashMap<>();

        Vestuario r0 = new Vestuario("Hering", "P");
        Vestuario r1 = new Vestuario("Nike", "M");
        Vestuario r2 = new Vestuario("Adidas", "G");

        Vestuario r3 = new Vestuario("Polo", "P");
        Vestuario r4 = new Vestuario("Heir", "M");
        Vestuario r5 = new Vestuario("Lacoste", "G");

        cliente1.add(r0);
        cliente1.add(r1);
        cliente1.add(r2);

        cliente2.add(r3);
        cliente2.add(r4);
        cliente2.add(r5);

        System.out.println(r0);
        System.out.println(r1);
        System.out.println(r2);


        GuardaRoupa g1 = new GuardaRoupa(01);
        //g1.guardarVestuario(roupas);
        int gaveta = g1.guardarVestuario(cliente1);
        System.out.println("Cliente, suas roupas estäo na gavete: "+ gaveta);
        System.out.println("Suas roupas são");
        System.out.println(g1.devolverVesturios(gaveta).toString());


        System.out.println("-----------Cliente2--------");

        gaveta = g1.guardarVestuario(cliente2);
        System.out.println("Cliente, suas roupas estäo na gavete: " + gaveta);
        System.out.println("Suas roupas são");
        System.out.println(g1.devolverVesturios(gaveta).toString());


        System.out.println("---------------------------------");
        System.out.println("Mostrar todo a Vestuario");

        g1.mostrarVestuario();


    }
}
