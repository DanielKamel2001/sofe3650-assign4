/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cashregister;

/**
 *
 * @author Jessica Leishman
 */
public class Product {
    private int UPCCode;
    private String name;
    private double price;

    //Sets the UPCCode, name and price for current scanned product
    public Product(int UPCCode, String name, double price) {
        this.UPCCode = UPCCode;
        this.name = name;
        this.price = price;
    }

    //Sets the UPCCode code for current scanned product
    public void setUPCCode(int UPCCode) {
        this.UPCCode = UPCCode;
    }

    //Returns the UPCCode code for current scanned product
    public int getUPCCode() {
        return UPCCode;
    }

    //Represents the Product object info as a string
    @Override
    public String toString() {
        return "Product{" + "UPCCode=" + UPCCode + ", name='" + name + '\'' + ", price=" + price + '}';
    }
}
