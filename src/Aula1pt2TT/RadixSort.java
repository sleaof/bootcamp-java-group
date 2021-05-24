package Aula1pt2TT;

import java.util.Arrays;

public class RadixSort {
    public static void radixSort(int iArr[]) {

        int n = iArr.length;
        System.out.println(n);
        int mx = iArr[0];
        for (int i = 1; i < n; i++)
            if (iArr[i] > mx)
                mx = iArr[i];
        System.out.println(mx);
        int imax = Arrays.stream(iArr).max().getAsInt();

        System.out.println(" aq"+ imax);
        String[] isArr = new String[iArr.length];
        
        System.out.println(isArr);
        String formatString = String.format("%0"+mx+"d", mx);
        String formattedString = String.format(formatString, mx);
    }

    public static void main(String[] args) {
        int iArr[] = {16223, 898, 13, 906, 235, 23, 9, 1532, 6388, 2511, 8};
        radixSort(iArr);
        for (int i : iArr) {
            System.out.print(i + " ");
        }
    }

}
