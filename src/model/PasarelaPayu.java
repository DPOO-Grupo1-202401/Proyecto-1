package model;

import java.io.FileWriter;
import java.util.Date;

import data.PurchasesReader;

public class PasarelaPayu extends Pasarela{

	public PasarelaPayu(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	public PasarelaPayu() {
		super();
		this.setNombre("Payu");
	}

	@Override
	public void registrarCompraPorPasarela() {
		String numeroTarjeta = util.Utils.input("Ingrese el numero de tarjeta: ");
		String cedulaPagador = util.Utils.input("Ingrese su número de cédula: ");
		String telefonoPagador = util.Utils.input("Ingrese su número de teléfono: ");
		String correoPagador = util.Utils.input("Ingrese su correo electrónico: ");
		System.out.println("Entidades bancarias disponibles: ");
		System.out.println("1. Banco de Bogotá");
		System.out.println("2. Banco de Occidente");
		System.out.println("4. Banco Davivienda");
		String entidadBancaria = null;
		while (entidadBancaria == null) {
			try {
				Integer opcion = Integer.parseInt(util.Utils.input("Ingrese una opcion de entidad bancaria: "));
				switch (opcion) {
				case 1:
					entidadBancaria = "Banco de Bogotá";
					break;
				case 2:
					entidadBancaria = "Banco de Occidente";
					break;
				case 3:
					entidadBancaria = "Banco Davivienda";
					break;
				default:
					System.out.println("Opción inválida.");
					break;
				}
			} catch (Exception e) {
				System.out.println("Opción inválida.");
			}
		}
		String monto = util.Utils.input("Ingrese el monto de la compra: ");
		try {
			// String headers = "Fecha, numeroTarjeta, cedulaPagador, telefonoPagador, correoPagador, entidadBancaria, monto";
			FileWriter editor = new FileWriter("db/payu.csv", true);
			String [] data = {new Date().toString(), numeroTarjeta, cedulaPagador, telefonoPagador, correoPagador, entidadBancaria, monto};
			editor.append(String.join(",", data) + "\n");
			editor.flush();
			editor.close();
			System.out.println("Pago exitoso por PAYU.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
