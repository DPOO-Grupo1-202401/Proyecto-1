package view;
import util.Utils;

import java.util.ArrayList;

import controller.LoginController;
import controller.UserController;
import model.Role;
import model.User;

public class InicioDeSesion {
    private LoginController loginController = new LoginController();
    private UserController userController = new UserController();
    private InterfazCliente interfazCliente = new InterfazCliente();
    private InterfazAdmin interfazAdmin = new InterfazAdmin();
    private InterfazEmpleado interfazEmpleado = new InterfazEmpleado();

    public void mostrarInicioDeSesion(ArrayList<Role> roles) {
        // TODO Auto-generated method stub
        
        String login = Utils.input("Ingrese su correo");
        String password = Utils.input("Ingrese su contraseña");
        boolean authenticated =  loginController.login(login, password, roles);
        if(authenticated) {
            System.out.print("Bienvenido ");
            User user = userController.getUser(login);
            switch (user.getRole().name()) {
                case "CLIENTE":
                    System.out.println("Cliente");
                    interfazCliente.mostrarOpciones();
                    break;
                case "OPERADOR":
                    System.out.println("Operador");
                    break;
                case "CAJERO":
                    System.out.println("Cajero");
                    interfazEmpleado.mostrarOpciones();
                    break;
                case "ADMINISTRADOR":
                    System.out.println("Administrador");
                    interfazAdmin.mostrarOpciones();
                    break;
                default:
                    break;
            }

            
        } else {
            System.out.println("Usuario o contraseña incorrectos");
        }
        
    }
}
