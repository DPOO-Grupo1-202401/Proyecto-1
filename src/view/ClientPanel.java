package view;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientPanel extends JPanel {

    private JButton inventoryButton;
    private JButton buyPieceButton;
    private JButton ownPiecesForSaleButton;
    private JButton boughtPiecesButton;
    private JButton sessionButton;
    private ArtGalleryLogin parentFrame;

    public ClientPanel(ArtGalleryLogin parentFrame) {
        this.parentFrame = parentFrame;
        setLayout(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();

        // Crear el panel
        JPanel panel = new JPanel(new GridBagLayout());

        // Botón "Consultar inventario de la galería"
        inventoryButton = new JButton("Consultar inventario de la galería");
        inventoryButton.addActionListener(new InventoryButtonListener());

        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.insets = new Insets(10, 10, 10, 10);
        panel.add(inventoryButton, constraints);

        // Botón "Comprar pieza"
        buyPieceButton = new JButton("Comprar pieza");
        buyPieceButton.addActionListener(new BuyPieceButtonListener());

        constraints.gridy = 1;
        panel.add(buyPieceButton, constraints);

        // Botón "Consultar piezas propias en venta"
        ownPiecesForSaleButton = new JButton("Consultar piezas propias en venta");
        ownPiecesForSaleButton.addActionListener(new OwnPiecesForSaleButtonListener());

        constraints.gridy = 2;
        panel.add(ownPiecesForSaleButton, constraints);

        // Botón "Consultar mis piezas compradas"
        boughtPiecesButton = new JButton("Consultar mis piezas compradas");
        boughtPiecesButton.addActionListener(new BoughtPiecesButtonListener());

        constraints.gridy = 3;
        panel.add(boughtPiecesButton, constraints);

        // Botón "Cerrar sesión"
        sessionButton = new JButton("Cerrar sesión");
        sessionButton.addActionListener(new SessionButtonListener());

        constraints.gridy = 4;
        panel.add(sessionButton, constraints);

        add(panel, BorderLayout.CENTER);
    }

    private class InventoryButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(ClientPanel.this, "Consultando inventario de la galería...");
        }
    }

    private class BuyPieceButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(ClientPanel.this, "Comprar pieza...");
        }
    }

    private class OwnPiecesForSaleButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(ClientPanel.this, "Consultar piezas propias en venta...");
        }
    }

    private class BoughtPiecesButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(ClientPanel.this, "Consultar mis piezas compradas...");
        }
    }

    private class SessionButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            parentFrame.showMainMenu();
        }
    }
}
