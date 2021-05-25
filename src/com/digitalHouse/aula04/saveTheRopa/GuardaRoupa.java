package com.digitalHouse.aula04.saveTheRopa;

import java.util.List;
import java.util.HashMap;
import java.util.Random;

public class GuardaRoupa {

    private Integer identificador;
    private HashMap<Integer, List<Vestuario>> hashMap = new HashMap<>();

    public Integer guardarVestuarios(List<Vestuario> listaDeVestuario) {
        hashMap.put(identificador = new Random().nextInt(), listaDeVestuario);
        return identificador;
    }

    public void mostrarVestuarios() {
        System.out.println(hashMap);
    }

    public void devolverVestuarios(Integer id) {
        if (hashMap.containsKey(id)) {
            hashMap.remove(id);
            System.out.println(hashMap);
        } else {
            System.out.println("Identificador não encontrado");
        }
    }
}
