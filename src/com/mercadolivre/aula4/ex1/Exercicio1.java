package com.mercadolivre.aula4.ex1;

import java.util.ArrayList;
import java.util.List;

public class Exercicio1 {
    public static void main(String[] args) {
        List<Disciplina> disciplinas = new ArrayList<>();
        Disciplina disciplina;
        List<Estudante> estudantes = new ArrayList<>();
        Estudante estudante;
        List<Turma> turmas = new ArrayList<>();
        Turma turma;

        for (int i = 0; i < 3; i++) {
            disciplina = new Disciplina();
            disciplina.setNome("disciplina" + i);
            disciplina.setCargaHoraria(i);

            disciplinas.add(disciplina);
            System.out.println(disciplinas.get(i).getNome());
            System.out.println(disciplinas.get(i).getCargaHoraria());
        }

        for (int i = 0; i < 6; i++) {
            estudante = new Estudante();
            estudante.setIdade(10 + i);
            estudante.setNome("aluno" + i);
            estudante.setMatricula(i);

            estudantes.add(estudante);
            System.out.println(estudantes.get(i).getNome());
            System.out.println(estudantes.get(i).getIdade());
            System.out.println(estudantes.get(i).getMatricula());
        }

        for (int i = 0; i < 3; i++) {
            turma = new Turma();
            turma.setSerie(i);
            turma.setCodId("a");
            turma.setEstudantes(estudantes);
            turma.setDisciplinas(disciplinas);

            turmas.add(turma);
            System.out.println(turmas.get(i).getCodId());
            System.out.println(turmas.get(i).getSerie());
        }

    }
}
