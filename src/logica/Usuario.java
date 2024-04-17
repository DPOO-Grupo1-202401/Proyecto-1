package logica;

public abstract class Usuario {
	
	protected String login;
	protected String password;
	protected String nombre;
	protected String numeroTelefono;
	protected String compras;
	
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNumeroTelefono() {
		return numeroTelefono;
	}
	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}
	public String getCompras() {
		return compras;
	}
	public void setCompras(String compras) {
		this.compras = compras;
	}
	
	
	public Usuario(String login, String password, String nombre, String numeroTelefono, String compras) {
		
		this.login = login;
		this.password = password;
		this.nombre = nombre;
		this.numeroTelefono = numeroTelefono;
		this.compras = compras;
	}
	
	
	
}

