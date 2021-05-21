package com.mercadolivre.aula4.ex1;

import java.util.List;

public class Turma {
    private Integer serie;
    private String codId;
    private List<Estudante> estudantes;
    private List<Disciplina> disciplinas;

    public Turma() {}

    public Turma(Integer serie, String codId, List<Estudante> estudantes, List<Disciplina> disciplinas) {
        this.serie = serie;
        this.codId = codId;
        this.estudantes = estudantes;
        this.disciplinas = disciplinas;
    }

    public Integer getSerie() {
        return serie;
    }

    public void setSerie(Integer serie) {
        this.serie = serie;
    }

    public String getCodId() {
        return codId;
    }

    public void setCodId(String codId) {
        this.codId = codId;
    }

    public List<Estudante> getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(List<Estudante> estudantes) {
        this.estudantes = estudantes;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
}
