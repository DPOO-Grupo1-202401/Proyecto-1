package view;
import java.util.HashMap;

import controller.PieceController;
import model.Escultura;
import model.Foto;
import model.Piece;
import model.Pintura;
import model.Video;

public class ConsultaDePiezas {

    private PieceController controller = new PieceController();
    public void consultarPiezas() {
        HashMap<String, Piece> pieces =  controller.getPieces();
        System.out.println("Piezas en la galeria:");
        for (Piece piece : pieces.values()) {
            System.out.println( " Titulo: " + piece.getTitulo() + " Autor: " + piece.getAutor() + " Año: " + piece.getAnio() );
            System.out.println("    Propietario: " + piece.getPropietarioEmail());
            System.out.println("    Bloqueada: " + piece.getBloqueada());
            System.out.println("    Vendida: " + piece.getVendida());
            System.out.println("    Precio: " + piece.getPrecioVenta());
            System.out.println("    Lugar de creacion: " + piece.getLugarCreacion());
            if (piece instanceof Foto) {
                Foto foto = (Foto) piece;
                System.out.println("    "+piece.getClass());
                System.out.println("    Tipo: " + foto.getTipo());
                System.out.println("    Altura: " + foto.getAltura());
                System.out.println("    Ancho: " + foto.getAncho());
                
            } else if (piece instanceof Pintura) {
                                System.out.println("    "+piece.getClass());
                Pintura pintura = (Pintura) piece;
                System.out.println("    Tipo: " + pintura.getTipo());
                System.out.println("    Tecnica: " + pintura.getTecnica());
                System.out.println("    Estilo: " + pintura.getEstilo());
                System.out.println("    Alto: " + pintura.getAltura());
                System.out.println("    Ancho: " + pintura.getAncho());
                
            } else if (piece instanceof Video) {
                System.out.println("    "+piece.getClass());
                Video video = (Video) piece;
                System.out.println("    Tipo: " + video.getTipo());
                System.out.println("    Duracion: " + video.getDuracion());
                System.out.println("    Calidad: " + video.getCalidad());
                System.out.println("    Alto: " + video.getAltura());
                System.out.println("    Ancho: " + video.getAncho());
                
            } else if (piece instanceof Escultura) {
                System.out.println("    "+piece.getClass());
                Escultura escultura = (Escultura) piece;
                System.out.println("    Tipo: " + escultura.getTipo());
                System.out.println("    Material: " + escultura.getMaterial());
                System.out.println("    Alto: " + escultura.getAltura());
                System.out.println("    Ancho: " + escultura.getAncho());
                System.out.println("    Profundidad: " + escultura.getProfundidad());
                System.out.println("    Peso: " + escultura.getPeso());
            }
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
