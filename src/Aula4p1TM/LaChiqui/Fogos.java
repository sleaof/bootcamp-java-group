package Aula4p1TM.LaChiqui;

public class Fogos {
    private String fogos;
    private String barulho;

    public Fogos(String fogos, String barulho) {
        this.fogos = fogos;
        this.barulho = barulho;
    }

    public String getFogos() {
        return fogos;
    }

    public void setFogos(String fogos) {
        this.fogos = fogos;
    }

    public String getBarulho() {
        return barulho;
    }

    public void setBarulho(String barulho) {
        this.barulho = barulho;
    }

    @Override
    public String toString() {
        return "Fogos{" +
                "fogos='" + fogos + '\'' +
                ", barulho='" + barulho + '\'' +
                '}';
    }
}
