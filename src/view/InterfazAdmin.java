package view;

import controller.PieceController;
import controller.UserController;
import model.Role;
import model.User;
import util.Utils;

public class InterfazAdmin {

    private ConsultaDePiezas consultaDePiezas = new ConsultaDePiezas();
    private ConsultaDeUsuarios consultaDeUsuarios = new ConsultaDeUsuarios();
    private PieceController pieceController = new PieceController();
    private UserController userController = new UserController();

    public void mostrarOpciones() {
        Boolean continuar = true;
        while (continuar) {
            System.out.println("1. Ver piezas");
            System.out.println("2. Ver usuarios");
            System.out.println("3. Ingresar nuevo usuario");
            System.out.println("4. Ver ofertas de compra");
            System.out.println("5. Aprobar oferta de compra");
            System.out.println("6. Denegar oferta de compra");
            System.out.println("7. Registrar pieza vendida");
            System.out.println("8. Ver piezas de un artista");
            System.out.println("9. Ver piezas de un comprador");
            System.out.println("10. Salir");
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
                // Ingresar nuevo usuario
                {
                	User nuevoUsuario= new User("sam@domain.com","234","Samuel","31173849",Role.valueOf("CLIENTE"));
                	String login="sam@domain.com";
                	userController.agregarUsuario(login, nuevoUsuario);
                }
                    break;
                    
                case 4:
                    // Ver ofertas de compra
                    consultaDePiezas.consultarPiezasBloqueadas();
                    break;
                    
                case 5:
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
                case 6:
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
                case 7:
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
                case 8:
                	//Piezas de un artista
                    consultaDePiezas.consultarPiezasArtista(Utils.input("Ingrese nombre del artista"));
                    break;
                case 9:
                    // Consultar piezas de un comprador
                	consultaDePiezas.consultarPiezasPropietario(Utils.input("Ingrese email del comprador"));
                    break;
                    
                
                case 10:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }

}
