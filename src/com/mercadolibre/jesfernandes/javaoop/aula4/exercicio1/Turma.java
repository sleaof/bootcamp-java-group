package com.mercadolibre.jesfernandes.javaoop.aula4.exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Turma {

    String serie;
    Integer codigoIdentificador;
    List<Disciplina> disciplinas = new ArrayList<>();
    List<Estudante> estudantes = new ArrayList<>();

    public Turma(String serie, Integer codigoIdentificador) {
        this.serie = serie;
        this.codigoIdentificador = codigoIdentificador;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Integer getCodigoIdentificador() {
        return codigoIdentificador;
    }

    public void setCodigoIdentificador(Integer codigoIdentificador) {
        this.codigoIdentificador = codigoIdentificador;
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
}
