package controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import data.PieceReader;
import model.Piece;

public class PieceController {

    private PieceReader pieceReader = new PieceReader();
    
    public HashMap<String, Piece> getPieces() {
        return PieceReader.pieces;
    }

    public void comprarPieza(String titulo, String compradorEmail, String tipoPago) {
        Piece piece = PieceReader.pieces.get(titulo);
        if (piece != null){
            piece.setBloqueada(true);
            try {
                pieceReader.sync("db/");
            } catch (Exception e) {
                System.out.println("Error al sincronizar");
            }
        } else {
            System.out.println("No se encontro la pieza");
        }
    }

    public Boolean aprobarVenta(String titulo) {
        Piece piece = PieceReader.pieces.get(titulo);
        if (piece != null) {
            piece.setVentaAprobada(true);
            try {
                pieceReader.sync("db/");
            } catch (Exception e) {
                System.out.println("Error al sincronizar");
            }
            return true;
        } else {
            return false;
        }   
    }

    public Boolean denegarVenta(String titulo){
        Piece piece = PieceReader.pieces.get(titulo);
        if (piece != null) {
            piece.setBloqueada(false);
            piece.setVentaAprobada(false);
            try {
                pieceReader.sync("db/");
            } catch (Exception e) {
                System.out.println("Error al sincronizar");
            }
            return true;
        } else {
            return false;
        }
    }
    
    public Boolean registrarPago(String titulo) {
        Piece piece = PieceReader.pieces.get(titulo);
        if (piece != null) {
            piece.setPagada(true);
            try {
                pieceReader.sync("db/");
            } catch (Exception e) {
                System.out.println("Error al sincronizar");
            }
            return true;
        } else {
            return false;
        }   
    }

    public Boolean registrarVenta(String titulo) {
        Piece piece = PieceReader.pieces.get(titulo);
        if (piece != null) {
            piece.setVendida(true);
            try {
                pieceReader.sync("db/");
            } catch (Exception e) {
                System.out.println("Error al sincronizar");
            }
            return true;
        } else {
            return false;
        }   
    }
    
}
