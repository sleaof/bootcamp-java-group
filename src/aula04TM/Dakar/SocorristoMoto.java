package aula04TM.Dakar;

public class SocorristoMoto implements SocorrerMethod{
    @Override
    public void socorrer(Veiculo veiculo) {
        System.out.println("Socorrendo moto " + veiculo.getPlaca());
    }
}
