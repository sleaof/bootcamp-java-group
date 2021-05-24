package aula03TT.ex01;

public class Sword extends Weapon{

    public Sword(String name) {
        super(name);
    }

    @Override
    public void skill() {
        System.out.println("Golpe Fulminante");

    }
}
