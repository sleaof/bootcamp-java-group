package aula02TT.Ex04;

public class Analista extends FuncionarioCLT {
    private final static double bonus = 8.0;
    private final static Integer horasSemanais = 40;
    private final static Integer horasDescanso = 4;
    private final static double salarioBase = 4000.00;

    public Analista(String cargo, Integer qtdMetaBatida) {
        super(cargo, qtdMetaBatida, bonus, horasSemanais, horasDescanso, salarioBase);
    }
}

