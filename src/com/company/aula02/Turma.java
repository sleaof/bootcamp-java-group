package com.company.aula02;

import java.util.*;

public class Turma {

    private String codigoVerificador;
    private List<Disciplina> disciplinas;
    private List<Estudante> estudantes;
    private String serie;

    public Turma(String codigoVerificador, List<Disciplina> disciplinas, List<Estudante> estudantes, String serie) {
        this.codigoVerificador = codigoVerificador;
        this.disciplinas = disciplinas;
        this.estudantes = estudantes;
        this.serie = serie;
    }

    public String getCodigoVerificador() {
        return codigoVerificador;
    }

    public void setCodigoVerificador(String codigoVerificador) {
        this.codigoVerificador = codigoVerificador;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public List<Estudante> getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(List<Estudante> estudantes) {
        this.estudantes = estudantes;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "codigoVerificador='" + codigoVerificador + '\'' +
                ", disciplinas=" + disciplinas +
                ", estudantes=" + estudantes +
                ", serie='" + serie + '\'' +
                '}';
    }
}
