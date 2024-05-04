package OLD;

public class Comprador extends Usuario{
	


	private float valorMaximo;
	
	
	public Comprador(String login, String password, String nombre,
			String numeroTelefono, String compras, float valorMaximo) {
		super(login, password, nombre, numeroTelefono, compras);
		
		this.valorMaximo = valorMaximo;
	}
	
	public void getHistorialCompras() {}

}
