package com.digitalHouse.aula03.tm.aula05.exec01;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoas[] = {new Pessoa("Anna", "10445639900"), new Pessoa("Ace", "65748392010")};
        Celular celulares[] = {new Celular("67853436377", "89789"), new Celular("67673839200", "12324")};

        SortUtil.sort(pessoas);
        SortUtil.sort(celulares);

        for(Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getNome());
        }

        for(Celular celular : celulares) {
            System.out.println(celular.getNumber());
        }
    }
}
