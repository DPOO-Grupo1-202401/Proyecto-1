package model;

public class Purchase {
    private Piece pieza;
    private User comprador;
    private Double precio;
    private String tipoPago;
    private String fecha;


    public Piece getPieza() {
        return pieza;
    }

    public void setPieza(Piece pieza) {
        this.pieza = pieza;
    }

    public User getComprador() {
        return comprador;
    }

    public void setComprador(User comprador) {
        this.comprador = comprador;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }


    public Purchase(Piece pieza, User comprador, String tipoPago, String fecha, Double precio) {   
        this.pieza = pieza;
        this.comprador = comprador;
        this.tipoPago = tipoPago;
        this.fecha = fecha;
        this.precio = precio;
    }
}
