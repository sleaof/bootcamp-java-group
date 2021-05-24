package com.mercadolibre.jesfernandes.javaoop.aula4.exercicio3.RegexPasswordValidator;

public class PasswordForte {

    //    (?=.*[0-9]) um dígito deve ocorrer pelo menos uma vez
    //    (?=.*[a-z]) uma letra minúscula deve ocorrer pelo menos uma vez
    //    (?=.*[A-Z]) uma letra maiúscula deve ocorrer pelo menos uma vez
    //    (?=.*[@#$%^&+=]) um caractere especial deve ocorrer pelo menos uma vez
    //    (?=\\S+$) nenhum espaço em branco permitido em toda a string
    //    .{5,10} de 5 a 10 caracteres

    public static final String REGEX_FORTE = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{5,10}";

}
