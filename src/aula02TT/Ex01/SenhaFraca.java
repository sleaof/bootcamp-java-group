package aula02TT.Ex01;

public class SenhaFraca extends Senha{

    public SenhaFraca() {
        super("^(?=.*).{6,20}$");
    }
}
