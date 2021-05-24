package com.mercadolibre.jesfernandes.javaoop.aula5.exercicio1;

import java.util.ArrayList;

public class ProgramPrecedente {

    public static void main(String[] args) {
        ArrayList<Pessoa> pessoaList = new ArrayList<>();

        Pessoa p1, p2, p3, p4, p5;
        p1 = new Pessoa("Gui", "11111111111");
        p2 = new Pessoa("Juh", "55555555555");
        p3 = new Pessoa("Jeh", "33333333333");
        p4 = new Pessoa("Ste", "22222222222");
        p5 = new Pessoa("Gah", "4444444444");

        pessoaList.add(p1);
        pessoaList.add(p2);
        pessoaList.add(p3);
        pessoaList.add(p4);
        pessoaList.add(p5);

        SortUtil sortUtil = new SortUtil();
        System.out.println(sortUtil.sort(pessoaList));

        for (Pessoa p : pessoaList) {
            System.out.println(p.getName());
        }

        System.out.println(p5.precedeA(p1));
    }
}
