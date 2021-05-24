package com.digitalHouse.aula02.tt.aula04.exec03.um;

public class Password {

    private final String regex;
    private String pwd;

    public Password(String regex) {
        this.regex = regex;
    }

    public void setValue(String pwd) {
        if ((this.regex).matches(pwd)) {
            this.pwd = pwd;
        } else {
            throw new IllegalArgumentException();
        }
    }
}
