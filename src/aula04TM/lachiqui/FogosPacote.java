package aula04TM.lachiqui;

import java.util.ArrayList;
import java.util.List;

public class FogosPacote {

    List<FogosIndividual> pacote = new ArrayList<>();

    public void adicionarFogosPacote(String som){
        pacote.add(new FogosIndividual(som));
    }

    public void acionarPacote(){
        for(FogosIndividual f : pacote)
            System.out.println(f.getSom());
    }
}
