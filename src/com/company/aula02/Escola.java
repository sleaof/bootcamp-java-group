package com.company.aula02;

import java.util.*;

public class Escola {
    public static void main(String[] args) {
        List<Estudante> estudantes = new ArrayList<Estudante>();

        estudantes.add(new Estudante("Ana", 16, 2237, "3 ano A"));
        estudantes.add(new Estudante("João", 16, 2254, "3 ano A"));

        List<Disciplina> disciplinas = new ArrayList<Disciplina>();

        disciplinas.add(new Disciplina("Matemática", 400));
        disciplinas.add(new Disciplina("Física", 400));

        List<Turma> turmas = new ArrayList<Turma>();
        turmas.add(new Turma("ES43S", disciplinas, estudantes, "3 ano A"));
    }
}
