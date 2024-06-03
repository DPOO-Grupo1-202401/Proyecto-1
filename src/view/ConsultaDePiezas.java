package view;

import controller.PieceController;
import model.*;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class ConsultaDePiezas extends JFrame {
    private PieceController controller = new PieceController();
    private JTextArea textArea;
    private JButton btnConsultarPiezas, btnConsultarPiezasBloqueadas, btnConsultarPiezasPagadas, btnConsultarPiezasVendidas, btnConsultarPiezasPropietario, btnConsultarPiezasArtista, btnSalir;

    public ConsultaDePiezas() {
        setTitle("Consulta de Piezas");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // Crear componentes
        textArea = new JTextArea(15, 50);
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        btnConsultarPiezas = new JButton("Consultar Piezas");
        btnConsultarPiezasBloqueadas = new JButton("Consultar Piezas Bloqueadas");
        btnConsultarPiezasPagadas = new JButton("Consultar Piezas Pagadas");
        btnConsultarPiezasVendidas = new JButton("Consultar Piezas Vendidas");
        btnConsultarPiezasPropietario = new JButton("Consultar Piezas Propietario");
        btnConsultarPiezasArtista = new JButton("Consultar Piezas Artista");
        btnSalir = new JButton("Salir");

        // Panel de botones
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(7, 1));
        panelBotones.add(btnConsultarPiezas);
        panelBotones.add(btnConsultarPiezasBloqueadas);
        panelBotones.add(btnConsultarPiezasPagadas);
        panelBotones.add(btnConsultarPiezasVendidas);
        panelBotones.add(btnConsultarPiezasPropietario);
        panelBotones.add(btnConsultarPiezasArtista);
        panelBotones.add(btnSalir);

        // Panel principal
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BorderLayout());
        panelPrincipal.add(scrollPane, BorderLayout.CENTER);
        panelPrincipal.add(panelBotones, BorderLayout.EAST);

        add(panelPrincipal);

        // Agregar listeners a los botones
        btnConsultarPiezas.addActionListener(e -> consultarPiezas());
        btnConsultarPiezasBloqueadas.addActionListener(e -> consultarPiezasBloqueadas());
        btnConsultarPiezasPagadas.addActionListener(e -> consultarPiezasPagadas());
        btnConsultarPiezasVendidas.addActionListener(e -> consultarPiezasVendidas());
        btnConsultarPiezasPropietario.addActionListener(e -> consultarPiezasPropietario());
        btnConsultarPiezasArtista.addActionListener(e -> consultarPiezasArtista());
        btnSalir.addActionListener(e -> dispose());
    }

    void consultarPiezas() {
        textArea.setText("");
        HashMap<String, Piece> pieces = controller.getPieces();
        for (Piece piece : pieces.values()) {
            textArea.append(formatPiece(piece) + "\n");
        }
    }

    void consultarPiezasBloqueadas() {
        textArea.setText("");
        HashMap<String, Piece> pieces = controller.getPieces();
        for (Piece piece : pieces.values()) {
            if (piece.getBloqueada() && !piece.getVentaAprobada()) {
                textArea.append(formatPiece(piece) + "\n");
            }
        }
    }

    private void consultarPiezasPagadas() {
        textArea.setText("");
        HashMap<String, Piece> pieces = controller.getPieces();
        for (Piece piece : pieces.values()) {
            if (piece.getBloqueada() && piece.getVentaAprobada() && piece.getPagada()) {
                textArea.append(formatPiece(piece) + "\n");
            }
        }
    }

    private void consultarPiezasVendidas() {
        String compradorEmail = JOptionPane.showInputDialog(this, "Ingrese el email del comprador:");
        if (compradorEmail != null) {
            textArea.setText("");
            HashMap<String, Piece> pieces = controller.getPieces();
            for (Piece piece : pieces.values()) {
                if (piece.getVendida() && piece.getPropietarioEmail().equals(compradorEmail)) {
                    textArea.append(formatPiece(piece) + "\n");
                }
            }
        }
    }

    void consultarPiezasPropietario() {
        String propietarioEmail = JOptionPane.showInputDialog(this, "Ingrese tu email:");
        if (propietarioEmail != null) {
            textArea.setText("");
            HashMap<String, Piece> pieces = controller.getPieces();
            for (Piece piece : pieces.values()) {
                if (piece.getPropietarioEmail().equals(propietarioEmail)) {
                    textArea.append(formatPiece(piece) + "\n");
                }
            }
        }
    }

    void consultarPiezasArtista() {
        String artista = JOptionPane.showInputDialog(this, "Ingrese el nombre del artista:");
        if (artista != null) {
            textArea.setText("");
            HashMap<String, Piece> pieces = controller.getPieces();
            for (Piece piece : pieces.values()) {
                if (piece.getAutor().equals(artista)) {
                    textArea.append(formatPiece(piece) + "\n");
                }
            }
        }
    }

    private String formatPiece(Piece piece) {
        StringBuilder sb = new StringBuilder();
        sb.append("Titulo: ").append(piece.getTitulo()).append(" Autor: ").append(piece.getAutor()).append(" Año: ").append(piece.getAnio()).append("\n");
        sb.append("Propietario: ").append(piece.getPropietarioEmail()).append(" Bloqueada: ").append(piece.getBloqueada()).append(" Vendida: ").append(piece.getVendida()).append("\n");
        sb.append("Precio: ").append(piece.getPrecioVenta()).append(" Lugar de creación: ").append(piece.getLugarCreacion()).append("\n");

        if (piece instanceof Foto) {
            Foto foto = (Foto) piece;
            sb.append("Tipo: ").append(foto.getTipo()).append(" Altura: ").append(foto.getAltura()).append(" Ancho: ").append(foto.getAncho()).append("\n");
        } else if (piece instanceof Pintura) {
            Pintura pintura = (Pintura) piece;
            sb.append("Tipo: ").append(pintura.getTipo()).append(" Tecnica: ").append(pintura.getTecnica()).append(" Estilo: ").append(pintura.getEstilo()).append("\n");
            sb.append("Alto: ").append(pintura.getAltura()).append(" Ancho: ").append(pintura.getAncho()).append("\n");
        } else if (piece instanceof Video) {
            Video video = (Video) piece;
            sb.append("Tipo: ").append(video.getTipo()).append(" Duracion: ").append(video.getDuracion()).append(" Calidad: ").append(video.getCalidad()).append("\n");
            sb.append("Alto: ").append(video.getAltura()).append(" Ancho: ").append(video.getAncho()).append("\n");
        } else if (piece instanceof Escultura) {
        	Escultura escultura = (Escultura) piece;
        	sb.append("Tipo: ").append(escultura.getTipo()).append(" Material: ").append(escultura.getMaterial()).append("\n");
        	sb.append("Alto: ").append(escultura.getAltura()).append(" Ancho: ").append(escultura.getAncho()).append(" Profundidad: ").append(escultura.getProfundidad()).append(" Peso: ").append(escultura.getPeso()).append("\n");
        	}
        	return sb.toString();
        	}
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ConsultaDePiezas consultaDePiezas = new ConsultaDePiezas();
            consultaDePiezas.setVisible(true);
        });
    }
}
