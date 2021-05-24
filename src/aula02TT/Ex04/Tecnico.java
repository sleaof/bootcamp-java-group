package aula02TT.Ex04;

public class Tecnico extends  FuncionarioCLT{

    private final static double bonus = 5.0;
    private final static Integer horasSemanais = 40;
    private final static Integer horasDescanso = 0;
    private final static double salarioBase = 3200.00;

    public Tecnico(String cargo, Integer qtdMetaBatida) {
        super(cargo, qtdMetaBatida, bonus, horasSemanais, horasDescanso, salarioBase);
    }
}
