package org.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Product {
    private int code;
    private String name;
    private String brand;
    private BigDecimal price;
    private BigDecimal iva;

    //----------------Costructor-------------

    Random random = new Random();

    public Product(String name, String brand, BigDecimal price, BigDecimal iva) {
        this.code = generatedCode();
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.iva = iva;
    }


    //----------Getter e Setter----------------

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public BigDecimal getIva() {
        return iva;
    }

    //--------------Setter---------------

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }


    //------------Metodi---------------------

    private int generatedCode(){
        int generatedCode = random.nextInt(1, 100000000);
        return generatedCode;
    }

    public BigDecimal getFullPrice() {
        // prezzo completo = prezzo base + iva sul prezzo
        // fullPrice = price + price*vat
        BigDecimal ivaOnPrice = price.multiply(iva);
        BigDecimal fullPrice = price.add(ivaOnPrice);
        // prima di ritornare il prezzo setto la scala
        return fullPrice.setScale(2, RoundingMode.HALF_EVEN);

    }

    @Override
    public String toString() {
        return "Product{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", iva=" + iva  +
                '}';
    }
}
