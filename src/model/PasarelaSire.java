package model;

import java.io.FileWriter;
import java.util.Date;

import data.PurchasesReader;

public class PasarelaSire extends Pasarela{

	public PasarelaSire(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	public PasarelaSire() {
		super();
		this.setNombre("Sire");
	}

	@Override
	public void registrarCompraPorPasarela() {
		String numeroTarjeta = util.Utils.input("Ingrese el numero de tarjeta: ");
		String fechaVencimiento = util.Utils.input("Ingrese la fecha de vencimiento de la tarjeta: ");
		String CVC = util.Utils.input("Ingrese el CVC de la tarjeta: ");
		String direccionFacturacion = util.Utils.input("Ingrese la dirección de facturación: ");
		String codigoPostal = util.Utils.input("Ingrese su código postal: ");
		String monto = util.Utils.input("Ingrese el monto de la compra: ");
		try {
			// String headers = "Fecha, numeroTarjeta, fechaVencimiento, CVC, direccionFacturacion, codigoPostal, monto";
			FileWriter editor = new FileWriter("db/sire.csv", true);
			String [] data = {new Date().toString(), numeroTarjeta, fechaVencimiento, CVC, direccionFacturacion, codigoPostal, monto};
			editor.append(String.join(",", data) + "\n");
			editor.flush();
			editor.close();
			System.out.println("--------------------------------");
			System.out.println("--Sire has registered the payment successfully.--");
			System.out.println("--------------------------------");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
