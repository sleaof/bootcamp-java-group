package Aula4p1TM.DAKAR;

public class Main {
    public static void main(String[] args) {

        Corrida pc = new Corrida(100.000,40.000,"CopaPistão",2);
        Veiculo c1 = new Carro(123,10,"111");
        Veiculo c2 = new Carro(100, 20, "222");
        Veiculo c3 = new Carro(143,12,"333");
        Veiculo c4 = new Carro(140, 21, "444");
        Veiculo m1 = new Carro(144,30,"555");
        Veiculo m2 = new Carro(112, 24, "666");
        Veiculo m3 = new Carro(157,13,"777");
        Veiculo m4 = new Carro(98, 24, "888");

        pc.registrarCarro(c1);
        pc.registrarCarro(c2);
        pc.registrarCarro(c3);
        pc.registrarCarro(c4);
        pc.registrarCarro(m1);
        pc.registrarCarro(m2);
        pc.registrarCarro(m3);
        pc.registrarCarro(m4);
        pc.getQtdVeiculos();
        pc.iniciarCorrida();
        pc.socorrer();
        pc.socorrer(1);
    }
}
