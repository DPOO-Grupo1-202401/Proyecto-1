package view;

import controller.PieceController;
import util.Utils;
import view.ConsultaDePiezas;

public class InterfazCliente {

    private ConsultaDePiezas consultaDePiezas = new ConsultaDePiezas();
    private PieceController pieceController = new PieceController();

    public void mostrarOpciones() {
        Boolean continuar = true;

        while (continuar) {
            System.out.println("\n----------------------------------------------------------------------------------------");
            System.out.println("Bienvenido al Sistema de la Galeria");
            System.out.println("1. Consultar inventario de la galeria");
            System.out.println("2. Comprar una pieza");
            System.out.println("3. Consultar mis piezas");
            System.out.println("4. Cerrar sesion");

            int opcionSeleccionada = Integer.parseInt(Utils.input("\nPor favor seleccione una opcion"));

            switch (opcionSeleccionada) {
                case 1:
                    // Consultar inventario de la galeria
                    consultaDePiezas.consultarPiezas();
                    break;
                case 2:
                    pieceController.comprarPieza(Utils.input("Ingrese el titulo de la pieza"), Utils.input("Ingrese su email"));
                    break;
                case 3:
                    // Consultar mis piezas
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }

        System.out.println("Interfaz de cliente");
    }
    
}
