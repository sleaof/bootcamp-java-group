package aula04TM.savetheropa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRoupa {

    private Integer dicionario;
    private Integer contador = 1 ;
    List<Vestuario> roupas = new ArrayList<>();
    HashMap<Integer, List<Vestuario>> map = new HashMap<>();


    public GuardaRoupa(Integer dicionario) {
        this.dicionario = dicionario;
    }

    public Integer getDicionario() {
        return dicionario;
    }

    public void setDicionario(Integer dicionario) {
        this.dicionario = dicionario;
    }

    public HashMap<Integer, List<Vestuario>> getMap() {
        return map;
    }

    public List<Vestuario> getRoupas() {
        return roupas;
    }

    public Integer guardarVestuario(List<Vestuario> listaDeVestuario){
        map.put(this.contador, listaDeVestuario);
        this.contador++;
        return this.contador - 1;

    }

    public void mostrarVestuario(){
        for(Map.Entry<Integer, List<Vestuario>> roupas : map.entrySet())  {
            System.out.println(roupas);
        }
    }

    public List<Vestuario> devolverVesturios(Integer id){
        List<Vestuario> result = this.map.get(id);
        return result;

    }
}
