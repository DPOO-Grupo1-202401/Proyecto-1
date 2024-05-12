package view;

import controller.PieceController;
import controller.SubastaController;
import controller.UserController;
import util.Utils;


public class InterfazOperador {
	private ConsultaDePiezas consultaDePiezas = new ConsultaDePiezas();
    private PieceController pieceController = new PieceController();
    private SubastaController subastaController = new SubastaController();
    
    public void mostrarOpciones() {
        Boolean continuar = true;
        while (continuar) {
            System.out.println("1. Ver piezas");
            // TODO CONSULTAR SUBASTAS
            System.out.println("2. Registrar oferta");
            System.out.println("3. Ver piezas de un artista");
            
            System.out.println("4. Salir");
            Integer opcion = Integer.parseInt(Utils.input("Ingrese una opcion"));
            switch (opcion) {
                case 1:
                    consultaDePiezas.consultarPiezas();
                    break;
                
                case 2:
                //Actualizar oferta
                {
                    String pieza = Utils.input("Ingrese el titulo de la pieza a actualizar");
                    Boolean success = subastaController.actualizarOferta(pieza);
                    if (success) {
                        System.out.println("oferta actualizada");
                    } else {
                        System.out.println("No se encontro la pieza");
                    }
                }
                    break;
                case 3:
                    consultaDePiezas.consultarPiezasArtista(Utils.input("Ingrese nombre del artista"));
                    break;
                
                case 4:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }
    
    
    
    
}
