package model;

public class Purchase {
    private String pieza;
    private String comprador;
    private String precio;
    private String tipoPago;
    private String fecha;


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


    public Purchase(String pieza, String comprador, String tipoPago, String fecha, String precio) {   
        this.pieza = pieza;
        this.comprador = comprador;
        this.tipoPago = tipoPago;
        this.fecha = fecha;
        this.precio = precio;
    }
}
