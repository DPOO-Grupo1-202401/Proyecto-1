package model;

public class Escultura extends Piece {
    private String material;
    private Integer altura;// Como sus carcteristicas no cambian son strings
    private Integer ancho;
    private Integer profundidad;
    private Integer peso;

    
    
    // Constructor
    public Escultura(String titulo, String anio, String tipo, String lugarCreacion, String autor,
    String fechaConsignacion, String propietario, Boolean exposicion, Boolean subasta,
    Boolean bloqueada, Boolean aprobada, Boolean pagada, Boolean vendida, String fechaVenta,
    String precioVenta, String valorInicial, String valorMinimo, String fechaLimite, String material,
    Integer altura, Integer ancho, Integer profundidad, Integer peso) {
        super(titulo, anio, tipo, lugarCreacion, autor, fechaConsignacion, propietario, exposicion,
        subasta, bloqueada, aprobada, pagada, vendida, fechaVenta, precioVenta, valorInicial,
        valorMinimo, fechaLimite);
        this.material = material;
        this.altura = altura;
        this.ancho = ancho;
        this.profundidad = profundidad;
        this.peso = peso;
    }
    
    // Constructor base
    public Escultura(String titulo, String anio, String tipo, String lugarCreacion, String autor,
            String fechaConsignacion, String propietario, Boolean exposicion, Boolean subasta, Boolean bloqueada,
            Boolean aprobada, Boolean pagada, Boolean vendida, String fechaVenta, String precioVenta,
            String valorInicial, String valorMinimo, String fechaLimite) {
        super(titulo, anio, tipo, lugarCreacion, autor, fechaConsignacion, propietario, exposicion, subasta, bloqueada,
                aprobada, pagada, vendida, fechaVenta, precioVenta, valorInicial, valorMinimo, fechaLimite);
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public Integer getAncho() {
        return ancho;
    }

    public void setAncho(Integer ancho) {
        this.ancho = ancho;
    }

    public Integer getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(Integer profundidad) {
        this.profundidad = profundidad;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

}