package model;

public class Purchase {
    private String pieza;
    private String comprador;
    private String precio;
    private TipoPagoEnum tipoPago;
    private String fecha;

    public Purchase(String pieza, String comprador, TipoPagoEnum tipoPago, String fecha, String precio) {   
        this.pieza = pieza;
        this.comprador = comprador;
        this.tipoPago = tipoPago;
        this.fecha = fecha;
        this.precio = precio;
    }


    public String getPieza() {
        return pieza;
    }

    public void setPieza(String pieza) {
        this.pieza = pieza;
    }

    public String getComprador() {
        return comprador;
    }

    public void setComprador(String comprador) {
        this.comprador = comprador;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public TipoPagoEnum getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(TipoPagoEnum tipoPago) {
        this.tipoPago = tipoPago;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
