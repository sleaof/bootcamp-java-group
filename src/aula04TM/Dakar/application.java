package aula04TM.Dakar;

import aula03TM.ex01.SortUtil;

import java.util.Arrays;

public class application {

    public static void main(String[] args) {

        System.out.println("Criando instancias da corrida e veiculos");
        Corrida corrida = new Corrida(22.0,5000.00, "Corrida Livre", 10);

        Carro carro01 = new Carro(130.00, 30, 40, "EMT-0943");
        Carro carro02 = new Carro(110.00, 10, 10, "FXE-7288");
        Carro carro03 = new Carro(120.00, 20, 20, "RTI-5821");

        Veiculo moto01 = new Moto(140.00,40, 20,"XJS-0432");
        Veiculo moto02 = new Moto(160.00,60, 20,"SMM-0432");
        Veiculo moto03 = new Moto(180.00,80, 20,"POQ-0432");

        //Add os veiculos na lista da corrida
        corrida.getVeiculos().add(carro01);
        corrida.getVeiculos().add(carro02);
        corrida.getVeiculos().add(carro03);
        corrida.getVeiculos().add(moto01);
        corrida.getVeiculos().add(moto02);
        corrida.getVeiculos().add(moto03);

        System.out.println("E o vencedor foi: ");
        System.out.println(corrida.vencedorDaCorrida().toString());

        System.out.println("Listando veiculos participantes da corrida");
        System.out.println(corrida.getVeiculos());

        System.out.println("Removendo Participante");
        corrida.removerVeiculo(carro01);
        System.out.println(corrida.getVeiculos());

        System.out.println("Removendo por placa");
        corrida.removerVeiculoPorPlaca("FXE-7388");
        System.out.println(corrida.getVeiculos().toString());

        corrida.socorrerCarro("RTI-5821");
        corrida.socorrerMoto("POQ-0432");



    }
}
