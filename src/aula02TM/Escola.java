package aula02TM;

public class Escola {
    public static void main(String[] args) {
        Estudante e1 =  new Estudante("Joao", 28, "4182741" , "8");
        Estudante e2 =  new Estudante("Maria", 22, "3182741" , "7");
        Estudante e3 =  new Estudante("Jose", 23, "2182741" , "7");

        Disciplina d1 = new Disciplina("Geografia", 300);
        Disciplina d2 = new Disciplina("Historia", 400);

        Turma t1 = new Turma("8A",001);
        t1.disciplinas.add(d1);
        t1.estudantes.add(e1);

        Turma t2 = new Turma("7B",002);
        t2.disciplinas.add(d2);
        t2.estudantes.add(e2);
        t2.estudantes.add(e3);

        System.out.println(t2.getDisciplinas());

    }
}
