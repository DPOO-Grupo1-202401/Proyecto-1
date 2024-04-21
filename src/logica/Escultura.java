package logica;

import java.io.FileWriter;
import java.io.IOException;
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
	public float getAlto() {
		return alto;
	}
	public void setAncho(float ancho) {
		this.ancho = ancho;
	}
	public float getAncho() {
		return ancho;
	}
	public void setProfundidad(float profundidad) {
		this.profundidad = profundidad;
	}
	public float getProfundidad() {
		return profundidad;
	}

	public void setMaterialesConstruccion(String materialesConstruccion) {
		this.materialesConstruccion = materialesConstruccion;
	}
	public String getMaterialesConstruccion() {
		return materialesConstruccion;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getPeso() {
		return peso;
	}
	public void setRequiereElectricidad(Boolean requiereElectricidad) {
		this.requiereElectricidad = requiereElectricidad;
	}
	public Boolean getRequiereElectricidad() {
		return requiereElectricidad;
	}


	public Escultura(String titulo, String anio, String lugarCreacion, Usuario autor, String estado,
			String fechaConsignacion, Boolean bloqueada, float alto, float ancho, float profundidad,
			String materialesConstruccion, float peso, Boolean requiereElectricidad,Propietario propietario) {
		super(titulo, anio, lugarCreacion, autor, fechaConsignacion, propietario);
		
		this.alto = alto;
		this.ancho = ancho;
		this.profundidad = profundidad;
		this.materialesConstruccion = materialesConstruccion;
		this.peso = peso;
		this.requiereElectricidad = requiereElectricidad;
		this.propietario = propietario;
	}

	public void registrarEsculturas(Escultura escultura) {
        String titulo = escultura.getTitulo();
        String anio = escultura.getAnio();
        String lugarCreacion = escultura.getlugarCreacion();
        String autor = escultura.getAutor().getNombre();
        String fechaConsignacion = escultura.getFechaConsignacion();
		String login = escultura.getPropietario().getLogin();
        String alto = String() escultura.getAlto();
        String ancho = String() escultura.getAncho();
        String profundidad = String() escultura.getProfundidad();
        String materialesConstruccion = escultura.getMaterialesConstruccion();
		String peso = String() escultura.getPeso();
		String requiereElectricidad = String() escultura.getRequiereElectricidad();
	

        agregarEscultura(titulo + "," + anio + "," + lugarCreacion + "," + autor + ","

                + fechaConsignacion + "," + login + "," + alto + "," + ancho + "," + profundidad + "," + materialesConstruccion + "," + peso + "," + requiereElectricidad );

    }
	public void agregarEscultura(String texto) {

        FileWriter filewriter;

        try {

            filewriter = new FileWriter("./data_inventario/Esculturas.txt", true);

            filewriter.write(texto + "\n");

            filewriter.close();

        } catch (IOException e) {

            e.printStackTrace();

        }

    }
}
