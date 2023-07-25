package org.java.shop;

import java.math.BigDecimal;

public class Smartphone extends Product {

    private int codeIMEI;
    private int memory;

    //-------------Costruttore------------


    public Smartphone(String name, String brand, BigDecimal price, BigDecimal iva, int codeIMEI, int memory) {
        super(name, brand, price, iva);
        this.codeIMEI = codeIMEI;
        this.memory = memory;

    }

    //------------------getter e setter-------------------


    public int getCodeIMEI() {
        return codeIMEI;
    }

    public void setCodeIMEI(int codeIMEI) {
        this.codeIMEI = codeIMEI;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    //-----------------------Metodi----------------------------

    @Override
    public String toString() {
        return super.toString() +
                " Smartphone{" +
                "codeIMEI=" + codeIMEI +
                ", memory=" + memory +
                '}';

    }
}
