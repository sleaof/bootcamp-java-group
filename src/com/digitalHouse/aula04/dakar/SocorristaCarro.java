package com.digitalHouse.aula04.dakar;

public class SocorristaCarro implements Socorrista{

    @Override
    public void socorrer(Veiculo carro) {
        System.out.println("Socorrendo carro com placa: " + carro.getPlaca());
    }
}
