package com.mercadolibre.jesfernandes.javaoop.aula4.exercicio3.RegexPasswordValidator;

public class PasswordFraca {

    //    (?=.*[a-z]) uma letra minúscula deve ocorrer pelo menos uma vez
    //    (?=.*[A-Z]) uma letra maiúscula deve ocorrer pelo menos uma vez
    //    .{8,} no minimo 8 caracteres

    public static final String PASSWORD_FRACA = "(?=.*[a-z])(?=.*[A-Z]).{8,}";

}
