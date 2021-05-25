package com.digitalHouse.aula04.dakar;

public class SocorristaMoto implements Socorrista{
    @Override
    public void socorrer(Veiculo moto) {
        System.out.println("Socorrendo moto com placa: " + moto.getPlaca());
    }
}
