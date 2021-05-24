package aula03TM.ex02;

import java.util.Comparator;

public interface Sorter<T> {
    void sort(T[] arr, Comparator<T> c);
}
