package view;

import controller.PieceController;
import util.Utils;

public class InterfazAdmin {

    private ConsultaDePiezas consultaDePiezas = new ConsultaDePiezas();
    private ConsultaDeUsuarios consultaDeUsuarios = new ConsultaDeUsuarios();
    private PieceController pieceController = new PieceController();

    public void mostrarOpciones() {
        Boolean continuar = true;
        while (continuar) {
            System.out.println("1. Ver piezas");
            System.out.println("2. Ver usuarios");
            System.out.println("3. Ver ofertas de compra");
            System.out.println("4. Aprobar oferta de compra");
            System.out.println("5. Denegar oferta de compra");
            System.out.println("6. Registrar pieza vendida");
            System.out.println("7. Ver piezas de un artista");
            System.out.println("8. Ver piezas de un comprador");
            System.out.println("9. Salir");
            Integer opcion = Integer.parseInt(Utils.input("Ingrese una opcion"));
            switch (opcion) {
                case 1:
                    consultaDePiezas.consultarPiezas();
                    break;
                case 2:
                    // Ver usuarios
                    consultaDeUsuarios.consultarUsuarios();
                    break;
                case 3:
                    // Ver ofertas de compra
                    consultaDePiezas.consultarPiezasBloqueadas();
                    break;
                case 4:
                // 	Aprobar oferta
                {
                    String titulo = Utils.input("Ingrese el titulo de la pieza a aprobar");
                    Boolean success = pieceController.aprobarVenta(titulo);
                    if (success) {
                        System.out.println("Venta aprobada");
                    } else {
                        System.out.println("No se encontro la pieza");
                    }
                }
                    break;
                case 5:
                // Denegar oferta
                {
                    String titulo = Utils.input("Ingrese el titulo de la pieza a denegar");
                    Boolean success = pieceController.denegarVenta(titulo);
                    if (success) {
                        System.out.println("Venta denegada");
                    } else {
                        System.out.println("No se encontro la pieza");
                    }
                }
                    break;
                case 6:
                    // Registrar estado pieza vendida
                {
                    String titulo = Utils.input("Ingrese el titulo de la pieza que se vendio");
                    Boolean success = pieceController.registrarVenta(titulo);
                    if (success) {
                        System.out.println("Pieza Vendida");
                    } else {
                        System.out.println("No se encontro la pieza");
                    }
                }
                    break;
                case 7:
                	//Piezas de un artista
                    consultaDePiezas.consultarPiezasArtista(Utils.input("Ingrese nombre del artista"));
                    break;
                case 8:
                    // Consultar piezas de un comprador
                	consultaDePiezas.consultarPiezasPropietario(Utils.input("Ingrese email del comprador"));
                    break;
                case 9:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }

}
