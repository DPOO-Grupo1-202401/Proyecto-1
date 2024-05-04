package view;
import java.util.HashMap;

import controller.PieceController;
import model.Piece;

public class ConsultaDePiezas {

    private PieceController controller = new PieceController();
    public void consultarPiezas() {
        HashMap<String, Piece> pieces =  controller.getPieces();
        System.out.println("Piezas en la galeria:");
        for (Piece piece : pieces.values()) {
            System.out.println( " Titulo: " + piece.getTitulo() + " Autor: " + piece.getAutor() + " Año: " + piece.getAnio() + " Propietario: " + piece.getPropietarioEmail() + " Bloqueada: " + piece.getBloqueada() + " Vendida: " + piece.getVendida() );
        }
    }

    public void consultarPiezasBloqueadas(){
        HashMap<String, Piece> pieces =  controller.getPieces();
        System.out.println("Piezas bloqueadas en la galeria:");
        for (Piece piece : pieces.values()) {
            if(piece.getBloqueada() && !piece.getVendida()){
                System.out.println( " Titulo: " + "'" + piece.getTitulo()+ "'" + " Autor: " + piece.getAutor() + " Año: " + piece.getAnio() + " Propietario: " + piece.getPropietarioEmail() + " Bloqueada: " + piece.getBloqueada() + " Aprobada: " + piece.getVentaAprobada() );
            }
        }
    }

    public void consultarPiezasVendidas(){
        HashMap<String, Piece> pieces =  controller.getPieces();
        System.out.println("Piezas vendidas en la galeria:");
        for (Piece piece : pieces.values()) {
            if(piece.getVendida()){
                System.out.println( " Titulo: " + piece.getTitulo() + " Autor: " + piece.getAutor() + " Año: " + piece.getAnio() + " Propietario: " + piece.getPropietarioEmail() + " Bloqueada: " + piece.getBloqueada() + " Vendida: " + piece.getVendida() );
            }
        }
    }

    
    
}
