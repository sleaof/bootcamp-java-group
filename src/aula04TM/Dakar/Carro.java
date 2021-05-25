package aula04TM.Dakar;

public class Carro extends Veiculo{

    private static final double peso = 1000.00;
    private static final Integer rodas = 4;

    public Carro(double velocidade, double aceleracao, Integer anguloDeGiro, String placa) {
        super(velocidade, aceleracao, anguloDeGiro, placa, peso, rodas);

    }

}
