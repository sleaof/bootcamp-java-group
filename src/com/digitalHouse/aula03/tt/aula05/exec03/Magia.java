package com.digitalHouse.aula03.tt.aula05.exec03;

import java.util.concurrent.ThreadLocalRandom;

public class Magia extends Arma {
    @Override
    public boolean usar() {
        boolean feitico = ThreadLocalRandom.current().nextBoolean();
        if (feitico == false)
            return false;
        return true;
    }
}
