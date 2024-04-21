package logica;

import java.time.LocalDate;

public abstract class Pieza {
	
	private String titulo;
	private String anio;
	private String lugarCreacion;
	private Usuario autor;
	private String estado;
	private String fechaConsignacion;
	private Boolean bloqueada;
	private Propietario propietario;
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setAnio(String anio) {
		this.anio = anio;
	}
	public String getAnio() {
		return anio;

	public void setLugarCreacion(String lugarCreacion) {
		this.lugarCreacion = lugarCreacion;
	}
	public String getlugarCreacion() {
		return lugarCreacion;
	}

	public Usuario getAutor() {
		return autor;
	}
	public void setAutor(Usuario autor) {
		this.autor = autor;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
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

	public Propietario getPropietario() {
		return propietario;
	}
	public void setPropietraio(Propietario propietario) {
		this.propietario = propietario;
	}


	
	public Pieza(String titulo, String anio, String lugarCreacion, Usuario autor,String fechaConsignacion,String fechaConsignacion2, Boolean bloqueada2, Propietario propietario) {
		this.titulo = titulo;
		this.anio = anio;
		this.lugarCreacion = lugarCreacion;
		this.autor = autor;
		this.fechaConsignacion = fechaConsignacion;
		this.propietario = propietario;
	}
    public Pieza(String titulo2, LocalDate anio2, String lugarCreacion2, Usuario autor2, String estado2,
            LocalDate fechaConsignacion2, Boolean bloqueada2) {
        //TODO Auto-generated constructor stub
    }
    public Pieza(String titulo2, LocalDate anio2, String lugarCreacion2, Usuario autor2, LocalDate fechaConsignacion2,
            Propietario propietario2) {
        //TODO Auto-generated constructor stub
    }
    public Pieza(String titulo2, String anio2, String lugarCreacion2, Usuario autor2, String estado2,
            String fechaConsignacion2, Boolean bloqueada2, Propietario propietario2) {
        //TODO Auto-generated constructor stub
    }
    public Pieza(String titulo2, String anio2, String lugarCreacion2, Usuario autor2, String estado2,
            String fechaConsignacion2, Boolean bloqueada2, Propietario propietario2) {
        //TODO Auto-generated constructor stub
    }
	
	
}
