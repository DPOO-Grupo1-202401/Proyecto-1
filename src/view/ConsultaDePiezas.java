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
            System.out.println( " Titulo: " + piece.getTitulo() + " Autor: " + piece.getAutor() + " Año: " + piece.getAnio() + " Propietario: " + piece.getPropietarioEmail() + " Bloqueada: " + piece.getBloqueada() + " Vendida: " + piece.getVendida()+ "Precio: " + piece.getPrecioVenta());
        }
    }

    public void consultarPiezasBloqueadas(){
        HashMap<String, Piece> pieces =  controller.getPieces();
        System.out.println("Piezas bloqueadas en la galeria:");
        for (Piece piece : pieces.values()) {
            if(piece.getBloqueada() && !piece.getVentaAprobada()){
                System.out.println( " Titulo: " + "'" + piece.getTitulo()+ "'" + " Autor: " + piece.getAutor() + " Año: " + piece.getAnio() + " Propietario: " + piece.getPropietarioEmail() + " Bloqueada: " + piece.getBloqueada() + " Aprobada: " + piece.getVentaAprobada() );
            }
        }
    }

    public void consultarPiezasPagadas(){
        HashMap<String, Piece> pieces =  controller.getPieces();
        System.out.println("Piezas pagadas en la galeria:");
        for (Piece piece : pieces.values()) {
            if(piece.getBloqueada() && piece.getVentaAprobada() && piece.getPagada()){
                System.out.println( " Titulo: " + "'" + piece.getTitulo()+ "'" + " Autor: " + piece.getAutor() + " Año: " + piece.getAnio() + " Propietario: " + piece.getPropietarioEmail() + " Bloqueada: " + piece.getBloqueada() + " Aprobada: " + piece.getVentaAprobada() + " Pagada: " + piece.getPagada());
            }
        }
    }
    public void consultarPiezasVendidas(String compradorEmail){
        HashMap<String, Piece> pieces =  controller.getPieces();
        System.out.println("Piezas vendidas en la galeria:");
        for (Piece piece : pieces.values()) {
            if(piece.getVendida() && piece.getPropietarioEmail().equals(compradorEmail)){
                System.out.println( " Titulo: " + piece.getTitulo() + " Autor: " + piece.getAutor() + " Año: " + piece.getAnio() + " Propietario: " + piece.getPropietarioEmail() + " Bloqueada: " + piece.getBloqueada() + " Vendida: " + piece.getVendida() + " FechaVenta: " + piece.getFechaVenta() + " Precio: " + piece.getPrecioVenta());
            }
        }
    }
    public void consultarPiezasPropietario(String compradorEmail){
        HashMap<String, Piece> pieces =  controller.getPieces();
        System.out.println("Tus piezas: ");
        for (Piece piece : pieces.values()) {
            if(piece.getPropietarioEmail().equals(compradorEmail)){
                System.out.println( " Titulo: " + piece.getTitulo() + " Autor: " + piece.getAutor() + " Año: " + piece.getAnio() + " Propietario: " + piece.getPropietarioEmail() + " Bloqueada: " + piece.getBloqueada() + " Vendida: " + piece.getVendida() );
            }
        }
    }
    public void consultarPiezasArtista(String artista){
        HashMap<String, Piece> pieces =  controller.getPieces();
        System.out.println("Piezas del artista: ");
        for (Piece piece : pieces.values()) {
            if(piece.getAutor().equals(artista)){
                System.out.println( " Titulo: " + piece.getTitulo() + " Año: " + piece.getAnio() + " FechaVenta: " + piece.getFechaVenta() + " Precio: " + piece.getPrecioVenta());
            }
        }
    }
    
}
