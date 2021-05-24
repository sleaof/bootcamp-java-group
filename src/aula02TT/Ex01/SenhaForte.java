package aula02TT.Ex01;

public class SenhaForte extends Senha{
    public SenhaForte() {
        super("ˆ([?=.*[0-9])(?=.*[a-z])(?=.*[0-9])(?=.*[A - Z]).{8,}$");
    }
}
