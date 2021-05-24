package com.digitalHouse.aula03.tm.aula05.exec01;

public class Main {
    public static void main(String[] args) {
        Pessoa arrPessoa[] = {new Pessoa("Anna", "10445639900"), new Pessoa("John", "65748392010")};
        Celular arrCelular[] = {new Celular("67853436377", "89789"), new Celular("67673839200", "12324")};

        SortUtil.sort(arrPessoa);
        SortUtil.sort(arrCelular);
    }
}
