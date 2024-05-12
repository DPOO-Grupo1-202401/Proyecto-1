package controller;

import java.util.HashMap;

import data.PieceReader;
import data.SubastasReader;
import model.Piece;
import model.Subasta;

public class SubastaController {
	private String batabase = "db/";

    private SubastasReader subastasReader = new SubastasReader();
    
    public HashMap<String, Subasta> getSubasta() {
        return SubastasReader.subastas;
    }
    public Boolean actualizarOferta(String pieza) {
        Subasta subasta = SubastasReader.subastas.get(pieza);
        if (subasta != null) {
        	subasta.setOferta(4500);
            try {
                subastasReader.sync(batabase);
            } catch (Exception e) {
                System.out.println("Error al sincronizar");
            }
            return true;
        } else {
            return false;
        }   
    }
    
}
