package Aula2pt1TM;


import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String serie;
    private String codIden;
    List<Estudante> estudantes = new ArrayList<>();
    List<Disciplina> disciplinas = new ArrayList<>();

    public Turma(String serie, String codIden) {
        this.serie = serie;
        this.codIden=  codIden;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getCodIden() {
        return codIden;
    }

    public void setCodIden(String codIden) {
        this.codIden = codIden;
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

    @Override
    public String toString() {
        return "Turma{" +
                "serie='" + serie + '\'' +
                ", codIden='" + codIden + '\'' +
                ", estudantes=" + estudantes +
                ", disciplinas=" + disciplinas +
                '}';
    }
}
