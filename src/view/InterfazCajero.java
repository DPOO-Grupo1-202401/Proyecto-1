package view;

import controller.PieceController;
import controller.PurchaseController;
import model.Purchase;
import model.Role;
import model.User;
import util.Utils;


public class InterfazCajero {
    private ConsultaDePiezas consultaDePiezas = new ConsultaDePiezas();
    private PieceController pieceController = new PieceController();
    private PurchaseController purchaseController = new PurchaseController();

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
                	// Ingresar nuevo usuario
                {
                	Purchase purchase= new Purchase("Solaris","maria@domain.com","3000","efectivo","2024-05-12");
                	String pieza="Solaris";
                	purchaseController.agregarPurchase(pieza, purchase);
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

