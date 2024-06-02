package model;

public enum TipoPagoEnum {
    TARJETA("TARJETA DE CREDITO"), 
    EFECTIVO("EFECTIVO"),
    CHEQUE("CHEQUE");

    private String nombre;

    TipoPagoEnum(String string) {
        this.nombre = string;
    }


}
