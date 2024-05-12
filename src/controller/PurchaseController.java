package controller;

import java.util.HashMap;


import data.PurchasesReader;


import model.Purchase;

public class PurchaseController {
	private String batabase = "db/";
	private PurchasesReader purchasesReader = new PurchasesReader();
    
    public void agregarPurchase(String pieza, Purchase purchase){
    	
    	PurchasesReader.purchases.put(pieza, purchase);
    	try {
            purchasesReader.sync(batabase);
        } catch (Exception e) {
            System.out.println("Error al sincronizar");
        }
    }
}