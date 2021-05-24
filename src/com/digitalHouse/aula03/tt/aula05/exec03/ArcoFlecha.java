package com.digitalHouse.aula03.tt.aula05.exec03;

import java.util.concurrent.ThreadLocalRandom;

public class ArcoFlecha extends Arma {

    private int flechas;

    @Override
    public boolean usar() {
        boolean acertou = false;
        if(this.flechas > 0) {
            acertou = ThreadLocalRandom.current().nextBoolean();
            if(acertou == false) {
                this.flechas--;
            } else {
                return true;
            }
        }
        return false;
    }
}
