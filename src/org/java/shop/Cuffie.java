package org.java.shop;

import java.math.BigDecimal;

public class Cuffie extends Product{
    private String colore;
    private String tipo;


    //--------------costruttore------------


    public Cuffie(String name, String brand, BigDecimal price, BigDecimal iva, String colore, String tipo) {
        super(name, brand, price, iva);
        this.colore = colore;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Cuffie{" +
                "colore='" + colore + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}


