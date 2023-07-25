package org.java.shop;

import java.math.BigDecimal;

public class Televisori extends Product{
    private int dimensioni;
    private boolean smart;

    //---------------costruttore


    public Televisori(String name, String brand, BigDecimal price, BigDecimal iva, int dimensioni, boolean smart) {
        super(name, brand, price, iva);
        this.dimensioni = dimensioni;
        this.smart = smart;
    }

    //--------------------Metodi---------------------------


    @Override
    public String toString() {
        return super.toString() +
                " Televisori{" +
                "dimensioni=" + dimensioni +
                ", smart='" + smart + '\'' +
                '}';
    }
}

