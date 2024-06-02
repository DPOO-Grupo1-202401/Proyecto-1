package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CashierPanel extends JPanel {

    private JButton viewPiecesButton;
    private JButton viewPurchaseOffersButton;
    private JButton registerPaymentButton;
    private JButton viewArtistPiecesButton;
    private JButton exitButton;
    private ArtGalleryLogin parentFrame;

    public CashierPanel(ArtGalleryLogin parentFrame) {
        this.parentFrame = parentFrame;
        setLayout(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();

        

        // Botón "Ver piezas"
        viewPiecesButton = new JButton("Ver piezas");
        viewPiecesButton.addActionListener(new ViewPiecesButtonListener());

        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.insets = new Insets(10, 10, 10, 10);
        this.add(viewPiecesButton, constraints);

        // Botón "Ver ofertas de compra"
        viewPurchaseOffersButton = new JButton("Ver ofertas de compra");
        viewPurchaseOffersButton.addActionListener(new ViewPurchaseOffersButtonListener());

        constraints.gridy = 1;
        this.add(viewPurchaseOffersButton, constraints);

        // Botón "Registrar Pago"
        registerPaymentButton = new JButton("Registrar Pago");
        registerPaymentButton.addActionListener(new RegisterPaymentButtonListener());

        constraints.gridy = 2;
        this.add(registerPaymentButton, constraints);

        // Botón "Ver piezas de un artista"
        viewArtistPiecesButton = new JButton("Ver piezas de un artista");
        viewArtistPiecesButton.addActionListener(new ViewArtistPiecesButtonListener());

        constraints.gridy = 3;
        this.add(viewArtistPiecesButton, constraints);

        // Botón "Salir"
        exitButton = new JButton("Salir");
        exitButton.addActionListener(new ExitButtonListener());

        constraints.gridy = 4;
        this.add(exitButton, constraints);

        
    }

    private class ViewPiecesButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(CashierPanel.this, "Ver piezas...");
        }
    }

    private class ViewPurchaseOffersButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(CashierPanel.this, "Ver ofertas de compra...");
        }
    }

    private class RegisterPaymentButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(CashierPanel.this, "Registrar Pago...");
        }
    }

    private class ViewArtistPiecesButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(CashierPanel.this, "Ver piezas de un artista...");
        }
    }

    private class ExitButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            parentFrame.showMainMenu();
        }
    }
}
