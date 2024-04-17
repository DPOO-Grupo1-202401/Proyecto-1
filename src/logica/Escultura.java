package logica;

import java.time.LocalDate;

public class Escultura extends Pieza{
	

	private float alto;
	private float ancho;
	private float profundidad;
	private String materialesConstruccion;
	private float peso;
	private Boolean requiereElectricidad;
	
	

	public void setAlto(float alto) {
		this.alto = alto;
	}
	public void setAncho(float ancho) {
		this.ancho = ancho;
	}
	public void setProfundidad(float profundidad) {
		this.profundidad = profundidad;
	}
	public void setMaterialesConstruccion(String materialesConstruccion) {
		this.materialesConstruccion = materialesConstruccion;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public void setRequiereElectricidad(Boolean requiereElectricidad) {
		this.requiereElectricidad = requiereElectricidad;
	}


	public Escultura(String titulo, LocalDate anio, String lugarCreacion, String autor, String estado,
			LocalDate fechaConsignacion, Boolean bloqueada, float alto, float ancho, float profundidad,
			String materialesConstruccion, float peso, Boolean requiereElectricidad) {
		super(titulo, anio, lugarCreacion, autor, estado, fechaConsignacion, bloqueada);
		
		this.alto = alto;
		this.ancho = ancho;
		this.profundidad = profundidad;
		this.materialesConstruccion = materialesConstruccion;
		this.peso = peso;
		this.requiereElectricidad = requiereElectricidad;
	}
}
