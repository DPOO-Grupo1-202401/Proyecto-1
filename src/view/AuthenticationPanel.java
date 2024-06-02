package view;
import javax.swing.*;

import controller.LoginController;
import controller.UserController;
import model.Role;
import model.User;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AuthenticationPanel extends JPanel {

    private JTextField userTextField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private ArtGalleryLogin parentFrame;
    private ArrayList<Role> roles;
    private String rolTest;

    public AuthenticationPanel(ArtGalleryLogin parentFrame, ArrayList<Role> roles) {
        this.parentFrame = parentFrame;
        this.roles = roles;
        setLayout(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();

        // Etiqueta y campo de texto para el nombre de usuario
        JLabel userLabel = new JLabel("Username: ");
        userTextField = new JTextField(20);

        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.insets = new Insets(10, 10, 10, 10);
        add(userLabel, constraints);

        constraints.gridx = 1;
        add(userTextField, constraints);

        // Etiqueta y campo de texto para la contraseña
        JLabel passwordLabel = new JLabel("Password: ");
        passwordField = new JPasswordField(20);

        constraints.gridx = 0;
        constraints.gridy = 1;
        add(passwordLabel, constraints);

        constraints.gridx = 1;
        add(passwordField, constraints);

        // Botón de inicio de sesión
        loginButton = new JButton("Login");
        loginButton.addActionListener(new LoginButtonListener());

        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        add(loginButton, constraints);
    }
    

    private class LoginButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String username = userTextField.getText();
            String password = new String(passwordField.getPassword());

            boolean authenticated =  LoginController.login(username, password, roles);

            if (authenticated) {
                JOptionPane.showMessageDialog(AuthenticationPanel.this, "Login successful!");
                User user = UserController.getUser(username);
                switch (user.getRole().name()) {
                    case "CLIENTE":
                        
                    	parentFrame.showClientPanel();
                        rolTest = "Cliente";
                        break;
                    case "OPERADOR":
                       
                    	parentFrame.showOperatorPanel();
                        rolTest = "Operador";
                        break;
                    case "CAJERO":
                        
                    	parentFrame.showCashierPanel();
                        rolTest = "Cajero";
                        break;
                    case "ADMINISTRADOR":
                        
                    	parentFrame.showAdminPanel();//juan@domain.com,123
                        rolTest = "Administrador";
                        break;
                    default:
                        break;
                }
                // Aquí puedes agregar la lógica para abrir la galería de arte
                parentFrame.showMainMenu();
            } else {
                JOptionPane.showMessageDialog(AuthenticationPanel.this, "Invalid username or password", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

}
