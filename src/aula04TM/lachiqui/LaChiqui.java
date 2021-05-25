package aula04TM.lachiqui;

import java.util.ArrayList;
import java.util.List;


public class LaChiqui {

    private String vela;

    List<ConvidadoStandard> convidadoStandar = new ArrayList<>();
    List<ConvidadoMeli> convidadoMeli = new ArrayList<>();

    List<FogosIndividual> fogos = new ArrayList<>();
    List<FogosPacote> fogos2 = new ArrayList<>();

    public List<FogosIndividual> getFogos() {
        return fogos;
    }

    public void setFogos(List<FogosIndividual> fogos) {
        this.fogos = fogos;
    }

    public List<FogosPacote> getFogos2() {
        return fogos2;
    }

    public void setFogos2(List<FogosPacote> fogos2) {
        this.fogos2 = fogos2;
    }

    public List<ConvidadoStandard> getConvidadoStandar() {
        return convidadoStandar;
    }

    public void setConvidadoStandar(List<ConvidadoStandard> convidadoStandar) {
        this.convidadoStandar = convidadoStandar;
    }

    public List<ConvidadoMeli> getConvidadoMeli() {
        return convidadoMeli;
    }

    public void setConvidadoMeli(List<ConvidadoMeli> convidadoMeli) {
        this.convidadoMeli = convidadoMeli;
    }

    public LaChiqui(String vela) {
        this.vela = vela;
    }

    public void acenderVela(){
        System.out.println("Vela Acesa");
    }

    public void apagarVela(){
        for(FogosPacote f : fogos2){
            f.acionarPacote();
        }
    }

    public void servirBolo(){
        for(ConvidadoMeli c : convidadoMeli){
            c.comerBolo();
        }
    }
}
