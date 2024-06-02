package controller;

import java.util.HashMap;

import data.PasarelasReader;
import data.PurchasesReader;
import model.Pasarela;
import model.Purchase;
import model.TipoPagoEnum;

public class PurchaseController {
	private String batabase = "db/";
	private PurchasesReader purchasesReader = new PurchasesReader();
    
    public void agregarPurchase(String pieza, Purchase purchase){
    	
    	PurchasesReader.purchases.put(pieza, purchase);
    	try {
            if (purchase.getTipoPago().equals(TipoPagoEnum.TARJETA)) {
                try {
                    HashMap<String, Pasarela> pasarelas = PasarelasReader.pasarelas;
                    Pasarela pasarela = null;
                    while (pasarela == null) {
                        System.out.println("Pasarelas disponibles: ");
                        for (Pasarela i_pasarela : pasarelas.values()) {
                            System.out.println(i_pasarela.getNombre());
                        }
                        String nombrePasarela = util.Utils.input("Ingrese el nombre de la pasarela a utilizar: ");
                        pasarela = pasarelas.get(nombrePasarela);
                    }

                    pasarela.registrarCompraPorPasarela();
                    System.out.println("Pago con tarjeta realizado con exito");
                } catch (Exception e) {
                    System.out.println("Error al realizar el pago con tarjeta");
                }
            } 
            purchasesReader.sync(batabase);
        } catch (Exception e) {
            System.out.println("Error al sincronizar");
        }
    }
}