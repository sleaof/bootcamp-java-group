package Aula3pt1TM.EX2;

import java.util.Comparator;

public interface Sorter<T>{
    public abstract void sort(T arr[], Comparator<T> c);
}
