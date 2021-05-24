package com.digitalHouse.aula03.tt.aula05.exec03;

public class Main {
    public static void main(String[] args) {
        Personagem mago = new Personagem("Mestre dos Magos", Classe.MAGO, 9, new Magia());
        Personagem arqueiro = new Personagem("Arqueiro", Classe.ARQUEIRO, 6, new ArcoFlecha());
        Personagem guerreiro = new Personagem("Guerreiro VX", Classe.GUERREIRO, 5, new Espada());

        if(mago.getArma().usar() == false) {
            mago.setNivel(mago.getNivel() - 1);
        }
        System.out.println(mago.getNivel());
    }
}
