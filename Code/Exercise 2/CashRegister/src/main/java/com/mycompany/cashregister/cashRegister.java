/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cashregister;

import com.mycompany.displayio.Display;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Jessica Leishman and Daniel Kamel
 */

//ActionListener is an interface that allows the CashRegister(controller) to listen to the Display(view)
public class cashRegister implements ActionListener {
    private Display display = new Display();
    private Product currentProduct;
    private ProductDB productDB = new ProductDB();
    private int UPCCode;

    public cashRegister() {
        //adds event listener to set behaviour of button
        display.getButton().addActionListener(this::actionPerformed);
    }

    //Sets the UPCCode code for current scanned product
    public void setCurrentProductUPCCode(int UPCCode) {
        this.UPCCode = UPCCode;
        this.currentProduct = this.getCurrentProductInfo();
        // Only print on the views if the product is defined
        if (this.currentProduct != null){
           this.display.displayText(this.currentProduct.toString());
        }else{
            this.display.displayText("nothing found");
        }
	}

	
    //Gets the product information for the latest scanned product from the database
    public Product getCurrentProductInfo() {
    	currentProduct = this.productDB.GetProductInfo(this.UPCCode);
	    return currentProduct;
    }

    //creates a cash register object with a display and database
    public static void main(String[] args) {
        cashRegister register = new cashRegister();
    }

    //When button is clicked on the display get the code and set to the current product
    @Override
    public void actionPerformed(ActionEvent e) {
        //throws error if code starts with something that isn't a number
        try{
            UPCCode = (Integer.parseInt(display.getText()));
            setCurrentProductUPCCode(UPCCode);
        }
        catch (java.lang.NumberFormatException i){
            System.out.println(i);
            display.displayText("not a code");
        }
    }
}
