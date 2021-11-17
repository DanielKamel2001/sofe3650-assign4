/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.scanner;

import com.mycompany.cashregister.cashRegister;

/**
 *
 * @author Jessica Leishman
 */
public class ScannerUtil {
    private cashRegister cashReg;

	public ScannerUtil(cashRegister cashReg) {
		this.cashReg = cashReg;
	}

	//Capture of UPCCode code using a bar scanner
	public void scannedUPCCode(int UPCCode) {
		this.cashReg.setCurrentProductUPCCode(UPCCode);
	}
}
