package aula02TT.Ex04;

public class Diretor extends FuncionarioCLT {
    private final static double bonus = 3.0;
    private final static Integer horasSemanais = 0;
    private final static Integer horasDescanso = 0;
    private final static double salarioBase = 15000.00;

    public Diretor(String cargo, Integer qtdMetaBatida) {
        super(cargo, qtdMetaBatida, bonus, horasSemanais, horasDescanso, salarioBase);
    }
}

