package com.mercadolibre.jesfernandes.javaoop.aula5.exercicio1;

import java.util.List;

public class SortUtil {

    public Object sort(List<Pessoa> pessoaList) {
        for (int i = 0; i < pessoaList.size(); i++) {
            for (int j = pessoaList.size() - 1; j > i; j--) {
                if (pessoaList.get(i).getName().compareToIgnoreCase(pessoaList.get(j).getName()) > 0) {
                    Pessoa p = pessoaList.get(i);
                    pessoaList.set(i, pessoaList.get(j));
                    pessoaList.set(j, p);
                    return pessoaList.get(j).name;
                }
            }
        }
        return null;
    }

}
