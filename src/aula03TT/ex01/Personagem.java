package aula03TT.ex01;

public class Personagem {

    private String name;
    private String classe;
    private Integer level;
    private Weapon weapon;

    public Personagem(){
    }

    public Personagem(String name, String classe, Integer level, Weapon weapon) {
        this.name = name;
        this.classe = classe;
        this.level = level;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "name='" + name + '\'' +
                ", classe='" + classe + '\'' +
                ", level=" + level +
                ", weapon=" + weapon +
                '}';
    }
}
