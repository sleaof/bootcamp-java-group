package com.digitalHouse.aula04.dakar;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Veiculo> veiculos = new ArrayList<>();
        Corrida corrida = new Corrida(289, 1000,"Formula 1", 3, veiculos);
        corrida.registrarCarro(100, 160, 90, "XSD4567");
        corrida.registrarCarro(60, 110, 20, "SRET9867");
        corrida.registrarMoto(150, 130, 10, "KUIT8765");

        corrida.removerVeiculoPorPlaca("SRET9867");

        corrida.registrarCarro(60, 110, 20, "SRET9867");

        System.out.println("Vencedor: " + corrida.calcularVencedor());

        corrida.socorrerCarro("SRET9867");
    }
}
