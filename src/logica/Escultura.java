package logica;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class Escultura extends Pieza{
	

	private String alto;
	private String ancho;
	private String profundidad;
	private String materialesConstruccion;
	private String peso;
	private String requiereElectricidad;
	
	

	public void setAlto(String alto) {
		this.alto = alto;
	}
	public String getAlto() {
		return alto;
	}
	public void setAncho(String ancho) {
		this.ancho = ancho;
	}
	public String getAncho() {
		return ancho;
	}
	public void setProfundidad(String profundidad) {
		this.profundidad = profundidad;
	}
	public String getProfundidad() {
		return profundidad;
	}

	public void setMaterialesConstruccion(String materialesConstruccion) {
		this.materialesConstruccion = materialesConstruccion;
	}
	public String getMaterialesConstruccion() {
		return materialesConstruccion;
	}
	public void setPeso(String peso) {
		this.peso = peso;
	}
	public String getPeso() {
		return peso;
	}
	public void setRequiereElectricidad(String requiereElectricidad) {
		this.requiereElectricidad = requiereElectricidad;
	}
	public String getRequiereElectricidad() {
		return requiereElectricidad;
	}


	public Escultura(String titulo, String anio, String lugarCreacion, Usuario autor, String estado,
			String fechaConsignacion, Boolean bloqueada, String alto, String ancho, String profundidad,
			String materialesConstruccion, String peso, String requiereElectricidad,Propietario propietario) {
		super(titulo, anio, lugarCreacion, autor, fechaConsignacion, materialesConstruccion, requiereElectricidad, propietario);
		
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
        float alto = escultura.getAlto();
        float ancho = escultura.getAncho();
        float profundidad = escultura.getProfundidad();
        String materialesConstruccion = escultura.getMaterialesConstruccion();
		float peso = escultura.getPeso();
		float requiereElectricidad = escultura.getRequiereElectricidad();
	

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
