package model;

import java.util.ArrayList;
import java.util.List;


public class User {
    private Role role;
    private String login;
	private String password;
	private String nombre;
	private String numeroTelefono;
	private List<Purchase> compras;
	
	
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
	public Role getRole() {
        return role;
    }
    public void setRole(Role role) {
        this.role = role;
    }
    public String getNumeroTelefono() {
		return numeroTelefono;
	}
	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}
	public List<Purchase> getCompras() {
		return compras;
	}

    public List<Purchase> addCompra(Purchase compra){
        compras.add(compra);
        return compras;
    }
	
	
	public User(String login, String password, String nombre, String numeroTelefono, Role role) {
		this.role = role;
		this.login = login;
		this.password = password;
		this.nombre = nombre;
		this.numeroTelefono = numeroTelefono;
		this.compras = new ArrayList<Purchase>();
	}

}
