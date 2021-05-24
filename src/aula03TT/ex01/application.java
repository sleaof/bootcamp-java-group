package aula03TT.ex01;

import java.util.Scanner;

public class application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Weapon w0 = new Sword("Rondel");
        Weapon w1 = new Bow("Gakung");
        Weapon w2 = new Maca("Maca Dourada");

        Personagem p1 = new Personagem("Gabriel","Sentila",120, w1);
        p1.getWeapon().skill();

        System.out.println("Trocando de arma");
        p1.setWeapon(w2);
        p1.getWeapon().skill();

        System.out.println("Trocando de arma de novo");
        p1.setWeapon(w0);
        p1.getWeapon().skill();


    }
}
