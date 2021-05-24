package com.digitalHouse.aula02.tm.aula04.exec02.seis;


public class StringUtil {

    public static String rpad(String s, char c, int n) {
        return String.format("%-" + n + "s", s).replace(' ', c);
    }

    public static String ltrim(String s) {
        return s.replaceAll("^\\s+", "");
    }

    public static String rtrim(String s) {
        return s.replaceAll("\\s+$", "");
    }

    public static String trim(String s) {
        return s.trim();
    }

    public static int indexOfN(String s, char c, int n) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                n--;
                if (n == 0) {
                    return i;
                }
            }
        }
        return -1;
    }
}
