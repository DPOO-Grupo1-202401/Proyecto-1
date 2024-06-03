package view;

import controller.PieceController;
import controller.UserController;
import model.Role;
import model.User;
import util.Utils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazAdmin extends JFrame {
    private ConsultaDePiezas consultaDePiezas = new ConsultaDePiezas();
    private ConsultaDeUsuarios consultaDeUsuarios = new ConsultaDeUsuarios();
    private PieceController pieceController = new PieceController();
    private UserController userController = new UserController();

    private JTextArea textArea;
    private JButton btnVerPiezas, btnVerUsuarios, btnIngresarUsuario, btnVerOfertasCompra, btnAprobarOferta, btnDenegarOferta, btnRegistrarPiezaVendida, btnVerPiezasArtista, btnVerPiezasComprador, btnSalir;

    public InterfazAdmin() {
        setTitle("Interfaz de Administrador");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Crear componentes
        textArea = new JTextArea(10, 50);
        textArea.setEditable(false);
        btnVerPiezas = new JButton("Ver piezas");
        btnVerUsuarios = new JButton("Ver usuarios");
        btnIngresarUsuario = new JButton("Ingresar nuevo usuario");
        btnVerOfertasCompra = new JButton("Ver ofertas de compra");
        btnAprobarOferta = new JButton("Aprobar oferta de compra");
        btnDenegarOferta = new JButton("Denegar oferta de compra");
        btnRegistrarPiezaVendida = new JButton("Registrar pieza vendida");
        btnVerPiezasArtista = new JButton("Ver piezas de un artista");
        btnVerPiezasComprador = new JButton("Ver piezas de un comprador");
        btnSalir = new JButton("Salir");

        // Panel de botones
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(5, 2));
        panelBotones.add(btnVerPiezas);
        panelBotones.add(btnVerUsuarios);
        panelBotones.add(btnIngresarUsuario);
        panelBotones.add(btnVerOfertasCompra);
        panelBotones.add(btnAprobarOferta);
        panelBotones.add(btnDenegarOferta);
        panelBotones.add(btnRegistrarPiezaVendida);
        panelBotones.add(btnVerPiezasArtista);
        panelBotones.add(btnVerPiezasComprador);
        panelBotones.add(btnSalir);

        // Panel principal
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BorderLayout());
        panelPrincipal.add(new JScrollPane(textArea), BorderLayout.CENTER);
        panelPrincipal.add(panelBotones, BorderLayout.SOUTH);

        add(panelPrincipal);

        // Agregar listeners a los botones
        btnVerPiezas.addActionListener(e -> consultaDePiezas.consultarPiezas());
        btnVerUsuarios.addActionListener(e -> consultaDeUsuarios.consultarUsuarios());
        btnIngresarUsuario.addActionListener(e -> ingresarNuevoUsuario());
        btnVerOfertasCompra.addActionListener(e -> consultaDePiezas.consultarPiezasBloqueadas());
        btnAprobarOferta.addActionListener(e -> aprobarOferta());
        btnDenegarOferta.addActionListener(e -> denegarOferta());
        btnRegistrarPiezaVendida.addActionListener(e -> registrarPiezaVendida());
        btnVerPiezasArtista.addActionListener(e -> verPiezasArtista());
        btnVerPiezasComprador.addActionListener(e -> verPiezasComprador());
        btnSalir.addActionListener(e -> System.exit(0));
    }

    private void ingresarNuevoUsuario() {
        User nuevoUsuario = new User("sam@domain.com", "234", "Samuel", "31173849", Role.valueOf("CLIENTE"));
        String login = "sam@domain.com";
        userController.agregarUsuario(login, nuevoUsuario);
        textArea.append("Nuevo usuario ingresado: " + nuevoUsuario.getNombre() + "\n");
    }

    private void aprobarOferta() {
        String titulo = JOptionPane.showInputDialog(this, "Ingrese el título de la pieza a aprobar");
        Boolean success = pieceController.aprobarVenta(titulo);
        if (success) {
            textArea.append("Venta aprobada: " + titulo + "\n");
        } else {
            textArea.append("No se encontró la pieza: " + titulo + "\n");
        }
    }

    private void denegarOferta() {
        String titulo = JOptionPane.showInputDialog(this, "Ingrese el título de la pieza a denegar");
        Boolean success = pieceController.denegarVenta(titulo);
        if (success) {
            textArea.append("Venta denegada: " + titulo + "\n");
        } else {
            textArea.append("No se encontró la pieza: " + titulo + "\n");
        }
    }

    private void registrarPiezaVendida() {
        String titulo = JOptionPane.showInputDialog(this, "Ingrese el título de la pieza que se vendió");
        Boolean success = pieceController.registrarVenta(titulo);
        if (success) {
            textArea.append("Pieza vendida: " + titulo + "\n");
        } else {
            textArea.append("No se encontró la pieza: " + titulo + "\n");
        }
    }

    private void verPiezasArtista() {
        String artista = JOptionPane.showInputDialog(this, "Ingrese el nombre del artista");
        consultaDePiezas.consultarPiezasArtista();
    }

    private void verPiezasComprador() {
        String comprador = JOptionPane.showInputDialog(this, "Ingrese el email del comprador");
        consultaDePiezas.consultarPiezasPropietario();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            InterfazAdmin interfazAdmin = new InterfazAdmin();
            interfazAdmin.setVisible(true);
        });
    }
}
