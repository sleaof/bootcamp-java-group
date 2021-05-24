package com.digitalHouse.aula03.tt.aula05.exec03;

import java.util.concurrent.ThreadLocalRandom;

public class Espada extends Arma{
    @Override
    public boolean usar() {
        boolean acertar = ThreadLocalRandom.current().nextBoolean();
        if (acertar == false)
            return false;
        return true;
    }
}
