package com.digitalHouse.aula02.tt.aula04.exec03.um;

public class PasswordMedia extends Password{

    public PasswordMedia() {
        super("^(?=.{7,})(((?=.*[A-Z])(?=.*[a-z]))|((?=.*[A-Z])(?=.*[0-9]))|((?=.*[a-z])(?=.*[0-9]))).*$");
    }
}
