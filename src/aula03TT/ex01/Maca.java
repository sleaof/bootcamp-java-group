package aula03TT.ex01;

public class Maca extends Weapon{


    public Maca(String name) {
        super(name);
    }

    @Override
    public void skill() {
        System.out.println("Punho Supremo de Asura");
    }
}
