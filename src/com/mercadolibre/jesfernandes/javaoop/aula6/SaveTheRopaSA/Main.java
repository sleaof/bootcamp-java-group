package com.mercadolibre.jesfernandes.javaoop.aula6.SaveTheRopaSA;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Clothing> listClothing = new ArrayList<>();
        Clothing clothing1 = new Clothing("geek10","shirt");
        Clothing clothing2 = new Clothing("nerdstore", "shirt");
        Clothing clothing3 = new Clothing("bulls", "shirt");
        listClothing.add(clothing1);
        listClothing.add(clothing2);
        listClothing.add(clothing3);

        Closet closet = new Closet();
        closet.addCloset(listClothing);
        closet.showCloset();
        closet.giveBack(1);
        closet.showCloset();

    }
}
