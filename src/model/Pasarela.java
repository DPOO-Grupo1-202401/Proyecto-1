package model;

public abstract class Pasarela {
	private String nombre;

	public Pasarela(){

	}
	
	public Pasarela(String nombre) {
		this.setNombre(nombre);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract void registrarCompraPorPasarela();

}
