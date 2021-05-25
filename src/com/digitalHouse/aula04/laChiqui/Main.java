package com.digitalHouse.aula04.laChiqui;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Convidado> convidados = new ArrayList<>();

        convidados.add(new ConvidadoMeli("Maria"));
        convidados.add(new ConvidadoMeli("Pedro"));
        convidados.add(new ConvidadoStandard("Ana"));
        convidados.add(new ConvidadoStandard("João"));

        Evento evento = new Evento(convidados);

        PacoteFogos fogos = new PacoteFogos();

        fogos.adicionarFogos("KABUM");
        fogos.adicionarFogos("SHBUM");
        fogos.adicionarFogos("MABUM");
        fogos.adicionarFogos("TEMBUM");

        fogos.acionar();

        evento.velasAcender();
        evento.velasApagar();

        if(evento.servirBolo()) {
            convidados = evento.getConvidados();
            for(Convidado c : convidados) {
                c.gritar();
            }
        }
    }
}
