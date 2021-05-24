package com.digitalHouse.aula03.tm.aula05.exec02;

import java.util.Comparator;

public interface Sorter<T> {
    public void sort(T arr[], Comparator<T> c);
}
