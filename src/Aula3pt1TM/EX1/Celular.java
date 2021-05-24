package Aula3pt1TM.EX1;

public class Celular implements Precedente<Celular> {
    private int number;
    private String holder;

    @Override
    public int precedeA(Celular celular) {
        return 0;
    }
}
