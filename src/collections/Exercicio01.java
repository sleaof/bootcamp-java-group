package collections;

import java.util.Arrays;
import java.util.Collections;

public class Exercicio01 {
    public static final Integer[] array = {52, 10, 85, 1324, 01, 13, 62, 30, 12,127};

    public static void main(String[] args) {
        Arrays.sort(array);
        printOrdemCrescente();
        printOrdemDescrecente();
        }

        private static void printOrdemCrescente(){
            System.out.println("Ordem crescente" + Arrays.toString(array));
        }
        private static void printOrdemDescrecente(){
            Collections.reverse(Arrays.asList(array));
            System.out.println("Ordem descrecente" + Arrays.toString(array));
        }
    }



