package Aula4p1TM.SaveTheRopa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GuardaRoupa {
    private Integer contador = 0;
    private Integer dicionario;
    HashMap< Integer,List<Vestuario>> roupasGuardadas = new HashMap<>();

    public Integer getDicionario() {
        return dicionario;
    }

    public void setDicionario(Integer dicionario) {
        this.dicionario = dicionario;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    public Integer guardaVestuarios(List<Vestuario> listaVestuario){
        roupasGuardadas.put(contador,listaVestuario);
        contador = getContador() + 1;

        return contador;
    }

    public void mostrarVestuario(){
        for ( Integer i : roupasGuardadas.keySet()) {
            System.out.println("key: " + i + " value: " + roupasGuardadas.get(i));
        }
    }

    public void devolverVestuario(Integer id) {
        roupasGuardadas.remove(id);
    }

    @Override
    public String toString() {
        return "GuardaRoupa{" +
                "dicionario=" + dicionario +
                '}';
    }
}
