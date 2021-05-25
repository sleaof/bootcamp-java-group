package aula04TM.Dakar;

public class SocorristaCarro implements SocorrerMethod{


    @Override
    public void socorrer(Veiculo veiculo) {
        System.out.println("Socorrendo o Carro : " + veiculo.getPlaca());
    }
}
