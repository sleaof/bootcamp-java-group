package Aula2pt2TM.Ex2;

public class Counter {
    private int aumentarValor;
    private int diminuirValor;

    public Counter(Counter counter) {
    }

    public Counter(int aumentarValor, int diminuirValor) {
        this.aumentarValor = aumentarValor;
        this.diminuirValor = diminuirValor;
    }

    public int getAumentarValor() {
        return aumentarValor;
    }

    public void setAumentarValor(int aumentarValor) {
        this.aumentarValor = aumentarValor;
    }

    public int getDiminuirValor() {
        return diminuirValor;
    }

    public void setDiminuirValor(int diminuirValor) {
        this.diminuirValor = diminuirValor;
    }
}
