package view;
import javax.swing.*;

import data.PasarelasReader;
import data.PieceReader;
import data.PurchasesReader;
import data.UserReader;
import model.Role;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

public class ArtGalleryLogin extends JFrame {

    private JButton clientButton;
    private JButton employeeButton;
    private JButton adminButton;
    private JButton exitButton;
    
    

    
    public void cargarDB() {
        try {
        	
            UserReader userReader = new UserReader();
            PieceReader pieceReader = new PieceReader();
            PasarelasReader pasarelasReader = new PasarelasReader();
            PurchasesReader purchasesReader = new PurchasesReader();

            Integer loadedPasarelas = pasarelasReader.loadPasarelas("db/");
            Integer loadedUsers = userReader.loadUsers("db/");
            Integer loadedPieces = pieceReader.loadPieces("db/");
            Integer loadedCompras = purchasesReader.loadCompras("db/");
           
        } catch (Exception e) {
            
            e.printStackTrace();
        }
    }
    
    public ArtGalleryLogin() {
        setTitle("Autenticacion Galeria de Arte ");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Crear el panel de botones
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();

        // Botón "Iniciar como cliente"
        clientButton = new JButton("Iniciar como cliente");
        clientButton.addActionListener(new ClientButtonListener());

        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.insets = new Insets(10, 10, 10, 10);
        panel.add(clientButton, constraints);

        // Botón "Iniciar como empleado"
        employeeButton = new JButton("Iniciar como empleado");
        employeeButton.addActionListener(new EmployeeButtonListener());

        constraints.gridy = 1;
        panel.add(employeeButton, constraints);

        // Botón "Iniciar como administrador"
        adminButton = new JButton("Iniciar como administrador");
        adminButton.addActionListener(new AdminButtonListener());

        constraints.gridy = 2;
        panel.add(adminButton, constraints);

        // Botón "Salir"
        exitButton = new JButton("Salir");
        exitButton.addActionListener(new ExitButtonListener());

        constraints.gridy = 3;
        panel.add(exitButton, constraints);

        // Agregar el panel de botones al JFrame
        add(panel, BorderLayout.CENTER);
    }

    private class ClientButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            showAuthenticationPanel(new ArrayList<Role>(Arrays.asList(Role.CLIENTE)));
            
        }
    }

    private class EmployeeButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            showAuthenticationPanel(new ArrayList<Role>(Arrays.asList(Role.CAJERO, Role.OPERADOR)));
            
        }
    }

    private class AdminButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            showAuthenticationPanel(new ArrayList<Role>(Arrays.asList(Role.ADMINISTRADOR)));
            
        }
    }

    private class ExitButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    private void showAuthenticationPanel(ArrayList<Role> roles) {
        getContentPane().removeAll();
        add(new AuthenticationPanel(this, roles), BorderLayout.CENTER);
        revalidate();
        repaint();
    }
    public void showClientPanel() {
        getContentPane().removeAll();
        add(new ClientPanel(this), BorderLayout.CENTER);
        revalidate();
        repaint();
    }
    public void showOperatorPanel() {
        getContentPane().removeAll();
        add(new OperatorPanel(this), BorderLayout.CENTER);
        revalidate();
        repaint();
    }
    public void showCashierPanel() {
        getContentPane().removeAll();
        add(new CashierPanel(this), BorderLayout.CENTER);
        revalidate();
        repaint();
    }
    public void showAdminPanel() {
        getContentPane().removeAll();
        add(new AdminPanel(this), BorderLayout.CENTER);
        revalidate();
        repaint();
    }

    public void showMainMenu() {
        getContentPane().removeAll();
        setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();

        JPanel panel = new JPanel(new GridBagLayout());

        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.insets = new Insets(10, 10, 10, 10);
        panel.add(clientButton, constraints);

        constraints.gridy = 1;
        panel.add(employeeButton, constraints);

        constraints.gridy = 2;
        panel.add(adminButton, constraints);

        constraints.gridy = 3;
        panel.add(exitButton, constraints);

        add(panel, BorderLayout.CENTER);
        revalidate();
        repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ArtGalleryLogin().setVisible(true);
                ArtGalleryLogin inicio = new ArtGalleryLogin(); 
                inicio.cargarDB();
                
            }
        });
    }
}
