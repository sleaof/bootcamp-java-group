package aula04TM.Dakar;

public class Moto extends Veiculo{

    private static final double peso = 300.00;
    private static final Integer rodas = 2;

    public Moto(double velocidade, double aceleracao, Integer anguloDeGiro, String placa) {
        super(velocidade, aceleracao, anguloDeGiro, placa, peso, rodas);

    }
}
