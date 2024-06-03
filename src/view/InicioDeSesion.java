package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

import controller.LoginController;
import controller.UserController;
import model.Role;
import model.User;

public class InicioDeSesion extends JFrame {
    private LoginController loginController = new LoginController();
    private UserController userController = new UserController();
    private InterfazCliente interfazCliente = new InterfazCliente();
    private InterfazAdmin interfazAdmin = new InterfazAdmin();
    private InterfazCajero interfazCajero = new InterfazCajero();
    private InterfazOperador interfazOperador = new InterfazOperador();
    
    private JTextField txtEmail;
    private JPasswordField txtPassword;
    private JButton btnLogin;
    private JTextArea textArea;

    public InicioDeSesion() {
        setTitle("Inicio de Sesión");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Crear componentes
        JLabel lblEmail = new JLabel("Correo:");
        JLabel lblPassword = new JLabel("Contraseña:");
        txtEmail = new JTextField(20);
        txtPassword = new JPasswordField(20);
        btnLogin = new JButton("Iniciar Sesión");
        textArea = new JTextArea(5, 30);
        textArea.setEditable(false);

        // Crear panel de inicio de sesión
        JPanel panelLogin = new JPanel();
        panelLogin.setLayout(new GridLayout(3, 2));
        panelLogin.add(lblEmail);
        panelLogin.add(txtEmail);
        panelLogin.add(lblPassword);
        panelLogin.add(txtPassword);
        panelLogin.add(btnLogin);
        
        // Panel principal
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BorderLayout());
        panelPrincipal.add(panelLogin, BorderLayout.CENTER);
        panelPrincipal.add(new JScrollPane(textArea), BorderLayout.SOUTH);
        
        add(panelPrincipal);

        // Agregar listener al botón de inicio de sesión
        btnLogin.addActionListener(e -> iniciarSesion());
    }

    public void mostrarInicioDeSesion(ArrayList<Role> roles) {
        setVisible(true);
    }
    
    private void iniciarSesion() {
        String login = txtEmail.getText();
        String password = new String(txtPassword.getPassword());
        ArrayList<Role> roles = new ArrayList<>(Arrays.asList(Role.CLIENTE, Role.CAJERO, Role.OPERADOR, Role.ADMINISTRADOR));
        
        boolean authenticated = loginController.login(login, password, roles);
        if (authenticated) {
            textArea.append("Bienvenido\n");
            User user = userController.getUser(login);
            switch (user.getRole().name()) {
                case "CLIENTE":
                    textArea.append("Cliente\n");
                    interfazCliente.mostrarOpciones();
                    break;
                case "OPERADOR":
                    textArea.append("Operador\n");
                    interfazOperador.mostrarOpciones();
                    break;
                case "CAJERO":
                    textArea.append("Cajero\n");
                    interfazCajero.mostrarOpciones();
                    break;
                case "ADMINISTRADOR":
                	textArea.append("Administrador\n");
                    InterfazAdmin interfazAdmin = new InterfazAdmin();
                    interfazAdmin.setVisible(true);
                    this.dispose();  // Cierra la ventana de inicio de sesión
                    break;
                default:
                    break;
            }
        } else {
            textArea.append("Usuario o contraseña incorrectos\n");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            InicioDeSesion inicioDeSesion = new InicioDeSesion();
            inicioDeSesion.setVisible(true);
        });
    }
}
