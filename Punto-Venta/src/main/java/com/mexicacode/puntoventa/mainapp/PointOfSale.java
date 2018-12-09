package com.mexicacode.puntoventa.mainapp;

import com.mexicacode.puntoventa.views.Login;

public class PointOfSale {
	
	public static void main(String[] args) {
		PointOfSale pofs = new PointOfSale();
		pofs.init();
	}
	
	public void init() {
		new Login(this);
	} 
	
}
