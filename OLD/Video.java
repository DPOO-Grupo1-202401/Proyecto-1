package OLD;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class Video extends Pieza{


	private String duracion;
	private String formato;
	private String dispositivoReproduccion;
	
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	public void setFormato(String formato) {
		this.formato = formato;
	}
	public void setDispositivoReproduccion(String dispositivoReproduccion) {
		this.dispositivoReproduccion = dispositivoReproduccion;
	}

	public String getDuracion() {
		return duracion;
	}
	public String getFormato() {
		return formato;
	}
	public String getDispositivoReproduccion() {
		return dispositivoReproduccion;
	}
	
	public Video(String titulo, String anio, String lugarCreacion, Usuario autor, String estado,
			String fechaConsignacion, Boolean bloqueada, String duracion, String formato, 
			String dispositivoReproduccion, Propietario propietario) {
		super(titulo, anio, lugarCreacion, autor, estado, fechaConsignacion, bloqueada,propietario);
		
		this.duracion = duracion;
		this.formato = formato;
		this.dispositivoReproduccion = dispositivoReproduccion;
	}

	public void registrarVideo(Video video) {
        String titulo = video.getTitulo();
        String anio = video.getAnio();
        String lugarCreacion = video.getlugarCreacion();
        String autor = video.getAutor().getNombre();
        String fechaConsignacion = video.getFechaConsignacion();
		String login = video.getPropietario().getLogin();

        String duracion = video.getDuracion();
        String formato = String() video.getFormato();
        String dispositivo = String() video.getDispositivoReproduccion();
        
	

        agregarVideo(titulo + "," + anio + "," + lugarCreacion + "," + autor + ","

                + fechaConsignacion + "," + login + "," + duracion + "," + formato + "," + dispositivoReproduccion );

    }
	public void agregarVideo(String texto) {

        FileWriter filewriter;

        try {

            filewriter = new FileWriter("./data_inventario/Video.txt", true);

            filewriter.write(texto + "\n");

            filewriter.close();

        } catch (IOException e) {

            e.printStackTrace();

        }

    }
}
