package com.mercadolibre.jesfernandes.javaoop.aula4.exercicio3.RegexPasswordValidator;

public class PasswordValidation {

    public static void main(String[] args) {

        String password1 = "aaBBc123@";
        System.out.println(password1.matches(PasswordForte.REGEX_FORTE));

        String password2 = "aaBBc1234";
        System.out.println(password2.matches(PasswordMedia.PASSWORD_MEDIA));

        String password3 = "aaBBc 123";
        System.out.println(password3.matches(PasswordFraca.PASSWORD_FRACA));

    }
}
