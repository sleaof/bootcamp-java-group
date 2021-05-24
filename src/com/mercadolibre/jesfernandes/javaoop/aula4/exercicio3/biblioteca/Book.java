package com.mercadolibre.jesfernandes.javaoop.aula4.exercicio3.biblioteca;

public class Book {

    String title;
    Integer isbn;
    String author;

    public Book(){}

    public Book(String title, Integer isbn, String author) {
        this.title = title;
        this.isbn = isbn;
        this.author = author;
    }

    public String loan(){
        return null;
    }

    public String giveBack(){
        return null;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getIsbn() {
        return isbn;
    }

    public void setIsbn(Integer isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return String.format("%s, %s - ISBN %s", this.title, this.author, this.isbn);
    }
}
