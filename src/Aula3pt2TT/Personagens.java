package Aula3pt2TT;

import java.util.Random;

public class Personagens {
    private String nome;
    private String classe;
    private int nivel;
    private String slot;
    private String poder;

    public Personagens(String nome, String classe) {
        this.nome = nome;
        this.classe = classe;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getSlot() {
        if (getClasse().equals("Mago")){
            setPoder("Orbe");
        }
        if (getClasse() == "Paladino"){
            setSlot("Espada e Escudo");
        }
        if (getClasse() == "Arqueiro"){
            setSlot("Arco e Flecha");
        }
        if (getClasse() == "Espiritualista"){
            setSlot("Orbe");
        }
        return slot;
    }

    public void setSlot(String slot) {

this.slot = slot;
    }


    public void nivel(){
        nivel += 10;
    }
    public void arma(){

    }

    public void poder(){
        if ( getSlot() == "Arco e Flecha"){
            setPoder("Chuva de flecha");
        }
        if ( getSlot() == "Espada e Escudo"){
            setPoder("Avançar e cortar");
        }
        if ( getSlot() == "Orbe"){
            setPoder("Tempestade nebulosa");
        }
        if ( getSlot() == "Orbe" && getClasse() == "Mago"){
            setPoder("Dragao de agua");
        }
    }

    @Override
    public String toString() {
        return "Personagens{" +
                "nome='" + nome + '\'' +
                ", classe='" + classe + '\'' +
                ", nivel=" + nivel +
                ", slot='" + slot + '\'' +
                ", poder='" + poder + '\'' +
                '}';
    }

    public static void main(String[] args) {
        String classe[] = {"Mago", "Paladino", "Arqueiro", "Espiritualista"};
        Random random = new Random();
        int index = random.nextInt(classe.length);

        Personagens p1 = new Personagens("IronSide", classe[index]);
        p1.nivel();
        p1.poder();
        System.out.println(p1.toString());
    }
}
