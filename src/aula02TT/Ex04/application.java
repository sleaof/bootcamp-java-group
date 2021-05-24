package aula02TT.Ex04;

//Essa classe tem por finalidade, testar os exercicios
public class application {
    public static void main(String[] args) {
        //Instanciando um tecnico

        FuncionarioCLT tec = new Tecnico("Tecnico", 0);
        tec.pagarSalario();
    }
}
