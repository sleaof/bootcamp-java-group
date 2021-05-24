package com.mercadolibre.jesfernandes.javaoop.aula4.exercicio3.biblioteca;

public class ProgramBook {

    public static void main(String[] args) {
        Book book = new Book();
        book.setAuthor("Stephen King");
        book.setIsbn(1);
        book.setTitle("IT");

        System.out.println(book);
    }
}
