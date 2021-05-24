package Aula3pt1TM;

public class Celular implements Precedente<Celular> {
    private int number;
    private String holder;

    @Override
    public int precedeA(Celular celular) {
        return 0;
    }
}
