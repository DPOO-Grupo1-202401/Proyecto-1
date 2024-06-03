package view;

import java.util.Date;

import controller.PieceController;
import controller.PurchaseController;
import model.Purchase;
import model.Role;
import model.TipoPagoEnum;
import model.User;
import util.Utils;

public class InterfazCajero {
    //private ConsultaDePiezasGUI consultaDePiezas = new ConsultaDePiezasGUI();
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
                  //  consultaDePiezas.consultarPiezas();
                    break;
                case 2:
                    // Ver ofertas
                   // consultaDePiezas.consultarPiezasBloqueadas();
                    break;
                case 3:
                // Ingresar nuevo usuario
                {
                    // private String pieza;
                    // private String comprador;
                    // private String precio;
                    // private TipoPagoEnum tipoPago;
                    // private String fecha;

                    String pieza = Utils.input("Ingrese el titulo de la pieza");
                    String comprador = Utils.input("Ingrese el email del comprador");
                    String precio = Utils.input("Ingrese el precio de la pieza");
                    TipoPagoEnum tipoPago = null;
                    System.out.println("Tipos de pago:");
                    for (TipoPagoEnum tipo : TipoPagoEnum.values()) {
                        System.out.println(tipo.toString());
                    }
                    while (tipoPago == null) {
                        try {
                            tipoPago = TipoPagoEnum.valueOf(Utils.input("Ingrese el tipo de pago"));
                        } catch (Exception e) {
                            System.out.println("Tipo de pago no valido");
                            tipoPago = null;
                            e.printStackTrace();
                        }
                    }

                    String fecha = new Date().toString();

                    Purchase purchase = new Purchase(pieza, comprador, tipoPago, fecha, precio);

                    purchaseController.agregarPurchase(pieza, purchase);
                }
                    break;
                case 4:
                   // consultaDePiezas.consultarPiezasArtista(Utils.input("Ingrese nombre del artista"));
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
