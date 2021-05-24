package Aula2pt2TM.Ex3;

public class Book {

    private String título;
    private String autor;

    public Book() {
    }

    public Book(String título, String autor) {
        this.título = título;
        this.autor = autor;
    }

    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void emprestimo(){

    }

    public void devolver(){

    }

    @Override
    public String toString(){
        return toString();
    }
}
