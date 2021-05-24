package aula02TM;

public class Estudante {
    private String nome;
    private Integer idade;
    private String nMatricula;
    private String serie;

    public Estudante(){
    }

    public Estudante(String nome, Integer idade, String nMatricula, String serie) {
        this.nome = nome;
        this.idade = idade;
        this.nMatricula = nMatricula;
        this.serie = serie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getnMatricula() {
        return nMatricula;
    }

    public void setnMatricula(String nMatricula) {
        this.nMatricula = nMatricula;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }


}
