package Aula4p1TM.SaveTheRopa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Vestuario {
    private String marca;
    private String modelo;

    public Vestuario() {
    }

    public Vestuario(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {

        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Vestuario{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Vestuario v1 = new Vestuario("Lacoste","camisa");
        Vestuario v2 = new Vestuario("Adidas","Jeans");
        Vestuario v3 = new Vestuario("Nike","Short");
        Vestuario v4 = new Vestuario("MauiSons","Bermuda");
        Vestuario v5 = new Vestuario("MauiSons","calça");

        List<Vestuario> roupasNicole = Arrays.asList(v1,v2);
        List<Vestuario> roupasCarol = Arrays.asList(v3,v4);
        List<Vestuario> roupasJessika = Arrays.asList(v5);
        GuardaRoupa gr = new GuardaRoupa();

        gr.guardaVestuarios(roupasNicole);
        gr.guardaVestuarios(roupasCarol);
        gr.guardaVestuarios(roupasJessika);
        gr.mostrarVestuario();
        gr.devolverVestuario(1);
        gr.mostrarVestuario();
    }
}
