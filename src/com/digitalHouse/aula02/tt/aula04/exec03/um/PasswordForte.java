package com.digitalHouse.aula02.tt.aula04.exec03.um;

public class PasswordForte extends Password{

    public PasswordForte() {
        super("^(?=.{8,})(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*\\W).*$");
    }
}
