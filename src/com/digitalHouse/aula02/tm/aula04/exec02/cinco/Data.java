package com.digitalHouse.aula02.tm.aula04.exec02.cinco;

import java.util.Calendar;
import java.text.ParseException;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

public class Data {

    private GregorianCalendar gc;
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");

    public Data() { }

    public static boolean validarData (String data) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            sdf.setLenient(false);
            sdf.parse(data);
            return true;
         } catch (ParseException ex) {
            return false;
        }
    }

    public void adicionarDia() {
        gc.add(Calendar.DAY_OF_MONTH, 1);
    }

    @Override
    public String toString() {
        return "Data{" +
                ", gc=" + gc +
                ", formato=" + formato +
                '}';
    }
}
