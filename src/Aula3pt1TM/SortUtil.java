package Aula3pt1TM;

import javax.swing.*;

public class SortUtil {
    public static <T> void sort(Precedente<T>[] arr) {
        bubbleSort(arr);
    }

    public static <T> void bubbleSort(Precedente<T>[] arr) {

        int n = arr.length;
        boolean keepSorting;
        for (int i = 0; i < n - 1; i++) {

            keepSorting = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].precedeA((T) arr[j + 1]) > 0) {
                    Precedente<T> temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    keepSorting = true;
                }
            }
            if (!keepSorting) break;
        }
    }

    public static void main(String[] args) {

        //Creamos un array de objetos de la clase empleados
        Pessoa pessoa[]=new Pessoa[3];

        //Creamos objetos en cada posicion
        pessoa[0]=new Pessoa("Guilherme", "324.234.234-32");
        pessoa[1]=new Pessoa("Guilherme", "897.546.123-32");
        pessoa[2]=new Pessoa("Luiz", "123.245.123-32");
        SortUtil.sort(pessoa);

        for (Pessoa p:pessoa) {
            System.out.println(p);
        }

    }
}
