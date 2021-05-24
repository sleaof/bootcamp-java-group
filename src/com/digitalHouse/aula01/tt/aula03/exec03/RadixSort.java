package com.digitalHouse.aula01.tt.aula03.exec03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RadixSort {

    public static void radixSort(int iArr[]) {
        String sArr[] = new String[iArr.length];
        String sArrZeros[] = zerosAEsquerda(sArr, iArr);
    }

    public static String[] zerosAEsquerda(String sArr[], int iArr[]) {
        String iMax = String.valueOf(Arrays.stream(iArr).max().getAsInt());
        for(int i = 0; i < iArr.length; i++) {
            sArr[i] = String.format("%0" + iMax.length() + "d",  iArr[i]);
        }
        return sArr;
    }

    public static void criarListas() {
        List<String> L0 = new ArrayList<String>();
        List<String> L1 = new ArrayList<String>();
        List<String> L2 = new ArrayList<String>();
        List<String> L3 = new ArrayList<String>();
        List<String> L4 = new ArrayList<String>();
        List<String> L5 = new ArrayList<String>();
        List<String> L6 = new ArrayList<String>();
        List<String> L7 = new ArrayList<String>();
        List<String> L8 = new ArrayList<String>();
        List<String> L9 = new ArrayList<String>();
    }

    public static void main(String[] args) {
        int iArr[] = {16223, 898, 13, 906, 235, 23, 9, 1532, 6388, 2511, 8};

        radixSort(iArr);

        /*for(int i : iArr) {
            System.out.println(i + "");
        }*/
    }
}
