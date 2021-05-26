package com.mercadolibre.jesfernandes.javaoop.aula6.Dakar;

public class Main {

    public static void main(String[] args) {

        SocorristaCarro socorreCarro = new SocorristaCarro();
        SocorristaMoto socorreMoto = new SocorristaMoto();

        CorridaImpl corridinha = new CorridaImpl(305.0, 100000.0, "corridinha", 10, socorreCarro, socorreMoto);

        corridinha.registraCarro(150.0, 200.0, 100.0, "AAA1");
        corridinha.registraCarro(200.0, 200.0, 100.0, "AAA2");
        corridinha.registraCarro(180.0, 200.0, 100.0, "AAA3");
        corridinha.registraCarro(170.0, 200.0, 100.0, "AAA4");
        corridinha.registraCarro(185.0, 200.0, 100.0, "AAA5");
        corridinha.registraMoto(220.0, 200.0, 100.0, "AAA6");
        corridinha.registraMoto(250.0, 200.0, 100.0, "AAA7");
        corridinha.registraMoto(190.0, 200.0, 100.0, "AAA8");
        corridinha.registraMoto(220.0, 200.0, 100.0, "AAA9");
        corridinha.registraMoto(220.0, 200.0, 100.0, "AAA0");

        corridinha.registraCarro(220.0, 200.0, 100.0, "AAA01");
        corridinha.registraMoto(220.0, 200.0, 100.0, "AAA01");

        corridinha.socorrerCarro("AAA1");
        corridinha.socorrerMoto("AAA6");

        corridinha.mostraVencedor();

    }
}
