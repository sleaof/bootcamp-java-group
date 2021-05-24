package Aula2pt1TM;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Escola {
    public static void main(String[] args) {

        String serie[] = {"9 ano A", "9 ano B", "9 ano C","8 ano A", "8 ano B", "8 ano C",};

        Random random = new Random();
        String principaltexto = serie[random.nextInt(serie.length)];

        Estudante al1 = new Estudante("luiz", 20 , 8023);
        Estudante al2 = new Estudante("Guilherme", 24 , 5321);
        Estudante al3 = new Estudante("Joao", 22 , 1241);
        Estudante al4 = new Estudante("Matheus", 32 , 8143);

        Disciplina d1 = new Disciplina("Matematica", 20);
        Disciplina d2 = new Disciplina("Historia", 20);
        Disciplina d3 = new Disciplina("Geografia", 20);
        Disciplina d4 = new Disciplina("Ciencia", 20);

        List<Disciplina> disciplinas1 = new ArrayList<>();
        Turma t1 = new Turma(principaltexto, "100");
        disciplinas1 = t1.getDisciplinas();
        t1.disciplinas.add(d1);
        t1.estudantes.add(al1);

        System.out.println(t1.toString());


    }
}
