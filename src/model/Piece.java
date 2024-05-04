package model;

public class Piece {
    private String titulo;
	private String anio;
	private String lugarCreacion;
	private String autor;
	private Boolean vendida;
	private String fechaConsignacion;
    private Boolean bloqueada;
	private String propietarioEmail;
    private Boolean ventaAprobada;

    

    public Piece(String titulo, String anio, String lugarCreacion, String autor, Boolean estado,
            String fechaConsignacion, Boolean bloqueada, Boolean aprobada, String propietario) {
        this.titulo = titulo;
        this.anio = anio;
        this.lugarCreacion = lugarCreacion;
        this.autor = autor;
        this.vendida = estado;
        this.fechaConsignacion = fechaConsignacion;
        this.bloqueada = bloqueada;
        this.ventaAprobada = aprobada;
        this.propietarioEmail = propietario;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAnio() {
        return anio;
    }
    public void setAnio(String anio) {
        this.anio = anio;
    }
    public String getLugarCreacion() {
        return lugarCreacion;
    }
    public void setLugarCreacion(String lugarCreacion) {
        this.lugarCreacion = lugarCreacion;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public Boolean getVendida() {
        return vendida;
    }
    public void setVendida(Boolean estado) {
        this.vendida = estado;
    }
    public String getFechaConsignacion() {
        return fechaConsignacion;
    }
    public void setFechaConsignacion(String fechaConsignacion) {
        this.fechaConsignacion = fechaConsignacion;
    }
    public Boolean getBloqueada() {
        return bloqueada;
    }
    public void setBloqueada(Boolean bloqueada) {
        this.bloqueada = bloqueada;
    }
    public String getPropietarioEmail() {
        return propietarioEmail;
    }
    public void setPropietarioEmail(String propietario) {
        this.propietarioEmail = propietario;
    }
    public Boolean getVentaAprobada() {
        return ventaAprobada;
    }
    public void setVentaAprobada(Boolean ventaAprobada) {
        this.ventaAprobada = ventaAprobada;
    }

    
}
