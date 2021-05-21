package com.digitalHouse.aula02.tm.aula04.exec02.tres;

public class Book {

    private String titulo;
    private String isbn;
    private String autor;
    private boolean reservado;

    public Book() { }

    public Book(String titulo, String isbn, String autor, boolean reservado) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.reservado = reservado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isReservado() {
        return reservado;
    }

    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }

    public void emprestimo() {
        this.reservado = true;
    }

    public void devolver() {
        this.reservado = false;
    }

    @Override
    public String toString() {
        return "Book{" +
                "titulo='" + titulo + '\'' +
                ", isbn='" + isbn + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}
