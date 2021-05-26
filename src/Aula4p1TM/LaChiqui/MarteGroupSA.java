package Aula4p1TM.LaChiqui;

import java.util.*;


public class MarteGroupSA {
    private List<Convidados> meli = new ArrayList<>();
    private List<Convidados> standard = new ArrayList<>();
    private HashMap<List<Convidados>, List<Convidados>> fogosG = new HashMap<>();
    private Integer organizador;
    private boolean velaApagada;
    private Fogos[] estourar;

    public MarteGroupSA(Fogos[] estourar) {
        setEstourar(estourar);
    }

    public boolean getVelaApagada() {
        return velaApagada;
    }

    public void setVelaAcesa(boolean velaApagada) {
        this.velaApagada = velaApagada;
    }

    public List<Convidados> getMeli() {
        return meli;
    }

    public void setMeli(List<Convidados> meli) {
        this.meli = meli;
    }

    public List<Convidados> getStandard() {
        return standard;
    }

    public void setStandard(List<Convidados> standard) {
        standard = standard;
    }

    public void listaDeArtificio() {
        System.out.println(fogosG.size());
    }

    public void convidados(Convidados c) {
        int x;
        do {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Esta entrando como: \n 1- MELI \n 2- STANDARD");
            x = teclado.nextInt();

            if (x == 1) {
                meli.add(c);
            }
            if (x == 2) {
                standard.add(c);
            }

        } while (x > 2 || x < 1);
        fogosG.put(meli, standard);

    }

    public void apagarVela() {
        setVelaAcesa(true);
        System.out.println(Arrays.toString(estourar));
        System.out.println("VVVVIIIVAAA LLLAAA CHIQUUEEE!!!!! \n" +fogosG );

    }

    public Fogos[] getEstourar() {
        System.out.println("get " + getEstourar());
        return estourar;
    }

    public void setEstourar(Fogos[] estourar) {
        this.estourar = estourar;
    }

    @Override
    public String toString() {
        return "MarteGroupSA{" +
                "meli=" + meli +
                ", standard=" + standard +
                ", fogosG=" + fogosG +
                ", organizador=" + organizador +
                ", velaAcesa=" + velaApagada +
                ", estourar=" + Arrays.toString(estourar) +
                '}';
    }
}
