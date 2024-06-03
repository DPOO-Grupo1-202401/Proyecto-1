package view;

import controller.PieceController;
import util.Utils;

public class InterfazCliente {

    //private ConsultaDePiezasGUI consultaDePiezas = new ConsultaDePiezasGUI();
    private PieceController pieceController = new PieceController();

    public void mostrarOpciones() {
        Boolean continuar = true;

        while (continuar) {
            System.out.println("\n----------------------------------------------------------------------------------------");
            System.out.println("Bienvenido al Sistema de la Galeria");
            System.out.println("1. Consultar inventario de la galeria");
            System.out.println("2. Comprar una pieza");
            System.out.println("3. Consultar mis piezas en venta");
            System.out.println("4. Consultar mis piezas compradas");
            System.out.println("5. Ver piezas de un artista");
            System.out.println("6. Cerrar sesion");

            int opcionSeleccionada = Integer.parseInt(Utils.input("\nPor favor seleccione una opcion"));

            switch (opcionSeleccionada) {
                case 1:
                    // Consultar inventario de la galeria
                   // consultaDePiezas.consultarPiezas();
                    break;
                case 2:
                	// Comprar pieza
                    pieceController.comprarPieza(Utils.input("Ingrese el titulo de la pieza"), Utils.input("Ingrese su email"),Utils.input("Ingrese su tipo de pago"));
                    break;
                case 3:
                    // Consultar piezas propias en venta
                	//consultaDePiezas.consultarPiezasPropietario(Utils.input("Ingrese su email"));
                    break;//pedro@domain.com
                case 4:
                    // Consultar mis piezas compradas
                	//consultaDePiezas.consultarPiezasPropietario(Utils.input("Ingrese su email"));
                    break;
                case 5:
                    //consultaDePiezas.consultarPiezasArtista(Utils.input("Ingrese nombre del artista"));
                    break;
                case 6:
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
