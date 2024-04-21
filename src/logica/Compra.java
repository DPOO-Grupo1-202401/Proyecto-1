package logica;

import java.time.LocalDate;

public class Compra {
    private Pieza pieza;
    private Comprador comprador;
    private String tipoPago;
    private String fecha;

    public Compra(Pieza pieza, Comprador comprador, String tipoPago, String fecha) {
        
        this.pieza = pieza;
        this.comprador = comprador;
        this.tipoPago = tipoPago;
        this.fecha = fecha;
    }
    
}
