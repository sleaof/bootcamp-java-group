package Aula1pt2TT;

import javax.crypto.AEADBadTagException;
import java.util.ArrayList;
import java.util.Arrays;

public class Test {

    public void numero() {

        int num = 9;
        String formatString = String.format("%0"+num+"d", 93);
        String formattedString = String.format(formatString);
        //int n = Integer.parseInt(formattedString);
        System.out.format(formattedString);
        int n = formattedString.length();
        System.out.print(" "+ n);

    }

    public static void main(String[] args) {
        Test t1 = new Test();
        t1.numero();
    }
}
