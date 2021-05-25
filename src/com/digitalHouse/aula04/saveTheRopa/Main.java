package com.digitalHouse.aula04.saveTheRopa;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Vestuario> vestuarios = new ArrayList<>();

        vestuarios.add(new Vestuario("John John", "M"));
        vestuarios.add(new Vestuario("BWG", "GG"));

        GuardaRoupa GP01 = new GuardaRoupa();

        System.out.println(GP01.guardarVestuarios(vestuarios));
        GP01.mostrarVestuarios();
    }
}
