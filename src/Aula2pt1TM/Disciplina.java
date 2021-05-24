package Aula2pt1TM;

public class Disciplina {
    private String nome;
    private Integer cargaHor;

    public Disciplina(String nome, Integer cargaHor) {
        this.nome = nome;
        this.cargaHor = cargaHor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCargaHor() {
        return cargaHor;
    }

    public void setCargaHor(Integer cargaHor) {
        this.cargaHor = cargaHor;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "nome='" + nome + '\'' +
                ", cargaHor=" + cargaHor +
                '}';
    }
}
