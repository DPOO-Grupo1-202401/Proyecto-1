package logica;

import java.time.LocalDate;

public abstract class Pieza {
	
	protected String titulo;
	protected LocalDate anio;
	protected String lugarCreacion;
	protected String autor;
	protected String estado;
	protected LocalDate fechaConsignacion;
	protected Boolean bloqueada;
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setAnio(LocalDate anio) {
		this.anio = anio;
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
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public LocalDate getFechaConsignacion() {
		return fechaConsignacion;
	}
	public void setFechaConsignacion(LocalDate fechaConsignacion) {
		this.fechaConsignacion = fechaConsignacion;
	}
	public Boolean getBloqueada() {
		return bloqueada;
	}
	public void setBloqueada(Boolean bloqueada) {
		this.bloqueada = bloqueada;
	}
	
	public Pieza(String titulo, LocalDate anio, String lugarCreacion, String autor, String estado,
			LocalDate fechaConsignacion, Boolean bloqueada) {
		
		this.titulo = titulo;
		this.anio = anio;
		this.lugarCreacion = lugarCreacion;
		this.autor = autor;
		this.estado = estado;
		this.fechaConsignacion = fechaConsignacion;
		this.bloqueada = bloqueada;
	}
	
	
	
}
