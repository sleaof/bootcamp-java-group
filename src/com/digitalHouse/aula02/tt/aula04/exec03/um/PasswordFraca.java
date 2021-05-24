package com.digitalHouse.aula02.tt.aula04.exec03.um;

public class PasswordFraca extends Password{

    public PasswordFraca() {
        super("(?=.{6,}).*");
    }
}
