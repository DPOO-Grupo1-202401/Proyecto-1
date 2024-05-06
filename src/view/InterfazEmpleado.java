package view;

import controller.PieceController;
import util.Utils;


public class InterfazEmpleado {
    private ConsultaDePiezas consultaDePiezas = new ConsultaDePiezas();
    private PieceController pieceController = new PieceController();

    public void mostrarOpciones() {
        Boolean continuar = true;
        while (continuar) {
            System.out.println("1. Ver piezas");
            System.out.println("2. Ver ofertas de compra");
            System.out.println("3. Registrar Pago");
            System.out.println("4. Ver piezas de un artista");
            System.out.println("5. Salir");
            Integer opcion = Integer.parseInt(Utils.input("Ingrese una opcion"));
            switch (opcion) {
                case 1:
                    consultaDePiezas.consultarPiezas();
                    break;
                case 2:
                    // Ver ofertas
                    consultaDePiezas.consultarPiezasBloqueadas();
                    break;
                case 3:
                    // Registrar Pago
                {
                    String titulo = Utils.input("Ingrese el titulo de la pieza a registrar");
                    Boolean success = pieceController.registrarPago(titulo);
                    if (success) {
                        System.out.println("Pago registrado");
                    } else {
                        System.out.println("No se encontro la pieza");
                    }
                }
                    break;
                case 4:
                    consultaDePiezas.consultarPiezasArtista(Utils.input("Ingrese nombre del artista"));
                    break;
                case 5:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }

}

