package com.mercadolibre.jesfernandes.javaoop.aula6.SaveTheRopaSA;

public class Clothing {

    String brand;
    String model;

    public Clothing(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
