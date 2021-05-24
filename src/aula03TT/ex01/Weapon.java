package aula03TT.ex01;

public abstract class Weapon {
    private String name;

    public Weapon(String name) {
        this.name = name;
    }

    public abstract void skill();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "name='" + name + '\'' +
                '}';
    }
}
