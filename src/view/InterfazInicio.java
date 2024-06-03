package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

import util.Utils;
import data.PasarelasReader;
import data.PieceReader;
import data.PurchasesReader;
import data.UserReader;
import model.Role;

public class InterfazInicio extends JFrame {

    private JButton btnCliente;
    private JButton btnEmpleado;
    private JButton btnAdmin;
    private JButton btnSalir;
    private JTextArea textArea;
    
    public InterfazInicio() {
        setTitle("Sistema de la Galeria");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Crear componentes
        btnCliente = new JButton("Iniciar sesión como cliente");
        btnEmpleado = new JButton("Iniciar sesión como empleado");
        btnAdmin = new JButton("Iniciar sesión como administrador");
        btnSalir = new JButton("Salir de la aplicación");
        textArea = new JTextArea(10, 40);
        textArea.setEditable(false);
        
        // Panel de botones
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(4, 1));
        panelBotones.add(btnCliente);
        panelBotones.add(btnEmpleado);
        panelBotones.add(btnAdmin);
        panelBotones.add(btnSalir);
        
        // Panel principal
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BorderLayout());
        panelPrincipal.add(panelBotones, BorderLayout.CENTER);
        panelPrincipal.add(new JScrollPane(textArea), BorderLayout.SOUTH);
        
        add(panelPrincipal);
        
        // Agregar listeners a los botones
        btnCliente.addActionListener(e -> iniciarSesionCliente());
        btnEmpleado.addActionListener(e -> iniciarSesionEmpleado());
        btnAdmin.addActionListener(e -> iniciarSesionAdmin());
        btnSalir.addActionListener(e -> salirAplicacion());
        
        cargarDB();
    }
    
    public void cargarDB() {
        try {
            UserReader userReader = new UserReader();
            PieceReader pieceReader = new PieceReader();
            PasarelasReader pasarelasReader = new PasarelasReader();
            PurchasesReader purchasesReader = new PurchasesReader();

            Integer loadedPasarelas = pasarelasReader.loadPasarelas("db/");
            textArea.append("Se cargaron " + loadedPasarelas + " pasarelas\n");
            Integer loadedUsers = userReader.loadUsers("db/");
            textArea.append("Se cargaron " + loadedUsers + " usuarios\n");
            Integer loadedPieces = pieceReader.loadPieces("db/");
            textArea.append("Se cargaron " + loadedPieces + " piezas\n");
            Integer loadedCompras = purchasesReader.loadCompras("db/");
            textArea.append("Se cargaron " + loadedCompras + " compras\n");
            
        } catch (Exception e) {
            textArea.append("Error: " + e.getMessage() + "\n");
            e.printStackTrace();
        }
    }
    
    private void iniciarSesionCliente() {
        textArea.append("Iniciar sesión como cliente\n");
        InicioDeSesion inicioDeSesion = new InicioDeSesion();
        inicioDeSesion.mostrarInicioDeSesion(new ArrayList<Role>(Arrays.asList(Role.CLIENTE)));
    }

    private void iniciarSesionEmpleado() {
        textArea.append("Iniciar sesión como empleado\n");
        InicioDeSesion inicioDeSesion = new InicioDeSesion();
        inicioDeSesion.mostrarInicioDeSesion(new ArrayList<Role>(Arrays.asList(Role.CAJERO, Role.OPERADOR)));
    }

    private void iniciarSesionAdmin() {
        textArea.append("Iniciar sesión como administrador\n");
        InicioDeSesion inicioDeSesion = new InicioDeSesion();
        inicioDeSesion.mostrarInicioDeSesion(new ArrayList<Role>(Arrays.asList(Role.ADMINISTRADOR)));
    }

    private void salirAplicacion() {
        textArea.append("Salir de la aplicación\n");
        System.exit(0);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            InterfazInicio interfaz = new InterfazInicio();
            interfaz.setVisible(true);
        });
    }
}

