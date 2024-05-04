package OLD;

import java.util.ArrayList;

public class Propietario extends Usuario{
	
	private ArrayList<Pieza> piezasPropias= new ArrayList<>();

	public Propietario(String login, String password, String nombre, String numeroTelefono,String compras, ArrayList<Pieza> piezasPropias) {
		super(login, password, nombre, numeroTelefono, compras);
	}
	
	public void getEstadoPieza() {}
	public void getHistorialPiezas() {}
	
}
