package aula03TT.ex01;

public class Bow extends Weapon{

    public Bow(String name) {
        super(name);
    }

    @Override
    public void skill() {
        System.out.println("Tempestade de Flechas");
    }

}
