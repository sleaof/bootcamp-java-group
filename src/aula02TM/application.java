package aula02TM;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;

public class application {
    public static void main(String[] args) {
       /* GregorianCalendar calendario = new GregorianCalendar();
        System.out.println(calendario.getTimeZone());
        calendario.add(Calendar.DAY_OF_MONTH,1);
        System.out.println(calendario.getTime());

        Data d = new Data();
        d.toString();

        */

        int [] vect = {123, 032, 543, 19, 2};

        String [] sVect = new String[vect.length];

        IntSummaryStatistics stat = Arrays.stream(vect).summaryStatistics();
        int vectMaxValue = stat.getMax();
        int vectMaxValueLength = String.valueOf(vectMaxValue).length();

        //System.out.println(vectMaxValue);
        //System.out.println("\n" + vectMaxValueLength);

        //Acrescentando 0 as esquerda
        for(int i = 0 ; i<vect.length; i++){
            sVect [i] = String.format("%0" + 3 + "d", vect[i]);
            System.out.println(sVect[i]);

        }
    }
}
