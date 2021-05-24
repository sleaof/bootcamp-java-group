package Aula2pt1TM;

public class Estudante {
    private String nome;
    private int idade;
    private int numMatric;
    private String serie;

    public Estudante(String nome, int idade, int numMatric) {
        this.nome = nome;
        this.idade = idade;
        this.numMatric = numMatric;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNumMatric() {
        return numMatric;
    }

    public void setNumMatric(int numMatric) {
        this.numMatric = numMatric;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    @Override
    public String toString() {
        return "Estudante{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", numMatric=" + numMatric +
                ", serie='" + serie + '\'' +
                '}';
    }
}
