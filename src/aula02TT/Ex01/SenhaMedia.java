package aula02TT.Ex01;

public class SenhaMedia extends Senha{

    public SenhaMedia() {
        super("ˆ([?=.*[0-9])(?=.*[A - Z]).{8,20}$");
    }
}
