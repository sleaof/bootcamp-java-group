package com.digitalHouse.aula04.laChiqui;

import java.util.List;
import java.util.ArrayList;

public class PacoteFogos {

    private List<Fogos> fogos = new ArrayList<>();
    private List<PacoteFogos> pacotefogos = new ArrayList<>();

    public void adicionarFogos(String barulho){
        fogos.add(new Fogos(barulho));
    }

    public void acionar(){
        for(Fogos f : fogos) {
            f.explodir();
        }
    }
}
