package aula02TM;

import java.util.ArrayList;
import java.util.List;

public class Turma {

    private String serie;
    private Integer codigo;

    List<Disciplina> disciplinas = new ArrayList<>();
    List<Estudante> estudantes = new ArrayList<>();

    public Turma(){
    }

    public Turma(String serie, Integer codigo) {
        this.serie = serie;
        this.codigo = codigo;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getSerie() {
        return serie;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public List<Estudante> getEstudantes() {
        return estudantes;
    }
}
