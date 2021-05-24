package com.mercadolibre.jesfernandes.javaoop.aula4.exercicio1;

public class Exercicio1 {

//    Você precisa entregar um sistema para gerenciamento de turmas em uma determinada escola.
//
//    Para isso você deverá desenvolver uma classe “turma” que deve ter a série e o código identificador (8º ano A, 9º ano C, etc…), um vetor de disciplinas e um vetor de estudantes.
//    Você deve desenvolver a classe “disciplina” que deve ter o nome e a carga horária
//    Você também deve criar a classe “estudante” que deverá receber um nome, idade, número de matrícula e série.
//    Por fim, você deverá criar alguns estudantes e disciplinas e, em seguida, criar algumas turmas e inserir os estudantes e disciplinas já criados nessas.

    public static void main(String[] args) {

        Estudante estudante1 = new Estudante("Je", 23, 1, "A");
        Estudante estudante2 = new Estudante("Ji", 23, 2, "B");

        Disciplina disciplina1 = new Disciplina("Java","500");
        Disciplina disciplina2 = new Disciplina( "Spring", "500");

        Turma turma1 = new Turma("A", 8);
        turma1.disciplinas.add(disciplina1);
        turma1.estudantes.add(estudante1);
        Turma turma2 = new Turma("B", 9);
        turma2.disciplinas.add(disciplina2);
        turma2.estudantes.add(estudante2);

        System.out.println("Turma1 : " + turma1.codigoIdentificador + "º ano " + turma1.getSerie());
        System.out.println("Aluno Turma1 : " + turma1.getEstudantes().get(0).nome);
        System.out.println("Turma2 : " + turma2.codigoIdentificador + "º ano " + turma2.getSerie());
        System.out.println("Aluno Turma2 : " + turma2.getEstudantes().get(0).nome);

    }

}
