package com.digitalHouse.aula04.laChiqui;

import java.util.List;
import java.util.ArrayList;

public class Evento {

    List<Convidado> convidados = new ArrayList<>();
    private boolean velas;

    public Evento(List<Convidado> convidados) {
        this.convidados = convidados;
    }

    public List<Convidado> getConvidados() {
        return convidados;
    }

    public void velasApagar() {
        velas = false;
    }

    public void velasAcender() {
        velas = true;
    }

    public boolean servirBolo() {
        if(velas == false)
            return true;
        return false;
    }
}
