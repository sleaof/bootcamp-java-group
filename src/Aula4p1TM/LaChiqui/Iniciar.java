package Aula4p1TM.LaChiqui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Iniciar {
    public static void main(String[] args) {

        Fogos f1 = new Fogos("Biribinha", "Track");
        Fogos f2 = new Fogos("Numero10", "Bummmm");
        Fogos f3 = new Fogos("Rojão", "ziiiiiuuu pooowww");
        Fogos[] fogos = {f1,f2,f3};


        Convidados c1 = new Convidados("Guilherme", f1);
        Convidados c2 = new Convidados("Joao",f2);
        Convidados c3 = new Convidados("Maria",f3);
        //System.out.println(Arrays.toString(fogos));
        MarteGroupSA ev1 = new MarteGroupSA(fogos);
        ev1.convidados(c1);
        ev1.convidados(c2);
        ev1.convidados(c3);
        ev1.apagarVela();

    }
}
