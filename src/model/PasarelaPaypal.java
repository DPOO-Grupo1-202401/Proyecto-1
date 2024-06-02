package model;

import java.io.FileWriter;
import java.util.Date;

import data.PurchasesReader;

public class PasarelaPaypal extends Pasarela {

	public PasarelaPaypal(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	public PasarelaPaypal() {
		super();
		this.setNombre("Paypal");
	}

	@Override
	public void registrarCompraPorPasarela() {
		String numeroTarjeta = util.Utils.input("Ingrese el numero de tarjeta: ");
		String correoRegistrado = util.Utils.input("Ingrese su correo registrado en paypal: ");
		String cedulaRecipiente = util.Utils.input("Ingrese la cedula del recipiente (debe estar registrado en paypal): ");
		String monto = util.Utils.input("Ingrese el monto de la compra: ");
		try {
			// String headers = "Fecha, numeroTarjeta, correoRegistrado, cedulaRecipiente, monto";
			FileWriter editor = new FileWriter("db/paypal.csv", true);
			String [] data = {new Date().toString(), numeroTarjeta, correoRegistrado, cedulaRecipiente, monto};
			editor.append(String.join(",", data) + "\n");
			editor.flush();
			editor.close();
			System.out.println("Compra registrada exitosamente a través de la pasarela Paypal.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
