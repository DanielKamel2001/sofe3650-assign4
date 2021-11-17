/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cashregister;

import com.mycompany.displayio.Display;

/**
 *
 * @author Jessica Leishman
 */
public class cashRegister {
    private Display display = new Display();
    private Product currentProduct;
    private ProductDB productDB = new ProductDB();
    private int UPCCode;


    //Sets the UPCCode code for current scanned product
	
    public void setCurrentProductUPCCode(int UPCCode) {
	this.UPCCode = UPCCode;
	this.currentProduct = this.getCurrentProductInfo();

	// Only print on the views if the product is defined
	if (this.currentProduct != null){
		// Displays the current scanned item
		this.display.displayText(this.currentProduct.toString());
		}
	}

	
    //Gets the product information for the latest scanned product from the database
    public Product getCurrentProductInfo() {
	currentProduct = this.productDB.GetProductInfo(this.UPCCode);
	return currentProduct;
    }
}
