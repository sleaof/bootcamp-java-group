package com.mercadolibre.jesfernandes.javaoop.aula5.exercicio3;

public class mainCharacter {

    String name;
    Classe classe;
    String nivel;
    String slot;

    public mainCharacter(String name, Classe classe, String nivel, String slot) {
        this.name = name;
        this.classe = classe;
        this.nivel = nivel;
        this.slot = slot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }
}
