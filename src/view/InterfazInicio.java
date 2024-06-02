package view;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import view.InicioDeSesion;
import util.Utils;
import data.PasarelasReader;
import data.PieceReader;
import data.PurchasesReader;
import data.UserReader;
import model.Role;

public class InterfazInicio {

    //public static void main(String[] args) throws FileNotFoundException, IOException {

     //   InterfazInicio consola = new InterfazInicio();
     //   consola.cargarDB();
     //   consola.ejecutarOpcion();
        

    //}
    

    public void cargarDB() {
        try {
        	
            UserReader userReader = new UserReader();
            PieceReader pieceReader = new PieceReader();
            PasarelasReader pasarelasReader = new PasarelasReader();
            PurchasesReader purchasesReader = new PurchasesReader();

            Integer loadedPasarelas = pasarelasReader.loadPasarelas("db/");
            System.out.println("Se cargaron " + loadedPasarelas + " pasarelas");
            Integer loadedUsers = userReader.loadUsers("db/");
            System.out.println("Se cargaron " + loadedUsers + " usuarios");
            Integer loadedPieces = pieceReader.loadPieces("db/");
            System.out.println("Se cargaron " + loadedPieces + " piezas");
            Integer loadedCompras = purchasesReader.loadCompras("db/");
            System.out.println("Se cargaron " + loadedCompras + " compras");
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void ejecutarOpcion() throws FileNotFoundException, IOException {
        InicioDeSesion inicioDeSesion = new InicioDeSesion();
        ConsultaDePiezas consultaDePiezas = new ConsultaDePiezas();
        
        boolean continuar = true;
        while (continuar) {
            try {

                System.out.println(
                        "\n----------------------------------------------------------------------------------------");
                System.out.println("Bienvenido al Sistema de la Galeria");
                System.out.println("1. Iniciar sesion como cliente");
                System.out.println("2. Iniciar sesion como empleado");
                System.out.println("3. Iniciar sesion como administrador");
                System.out.println("4. Salir de la aplicacion");

                int opcionSeleccionada = Integer.parseInt(Utils.input("\nPor favor seleccione una opcion"));

                switch (opcionSeleccionada) {
                    case 1:
                        System.out.println("Iniciar sesion como cliente");
                        inicioDeSesion.mostrarInicioDeSesion(
                                new ArrayList<Role>(Arrays.asList(Role.CLIENTE)));
                        break;
                    case 2:
                        System.out.println("Iniciar sesion como empleado");
                        inicioDeSesion.mostrarInicioDeSesion(
                                new ArrayList<Role>(Arrays.asList(Role.CAJERO, Role.OPERADOR)));
                        break;
                    case 3:
                        System.out.println("Iniciar sesion como administrador");
                        inicioDeSesion.mostrarInicioDeSesion(new ArrayList<Role>(Arrays.asList(Role.ADMINISTRADOR)));
                        break;
                    case 4:
                        System.out.println("Salir de la aplicacion");
                        continuar = false;
                        break;
                    default:
                        System.out.println("Opcion no valida");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        
    }
}
