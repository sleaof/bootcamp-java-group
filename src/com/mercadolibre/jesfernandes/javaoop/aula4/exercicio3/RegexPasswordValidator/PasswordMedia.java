package com.mercadolibre.jesfernandes.javaoop.aula4.exercicio3.RegexPasswordValidator;

public class PasswordMedia {

    //    (?=.*[0-9]) um dígito deve ocorrer pelo menos uma vez
    //    (?=.*[a-z]) uma letra minúscula deve ocorrer pelo menos uma vez
    //    (?=.*[A-Z]) uma letra maiúscula deve ocorrer pelo menos uma vez
    //    .{8,} no minimo 8 caracteres

    public static final String PASSWORD_MEDIA = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}";

}
