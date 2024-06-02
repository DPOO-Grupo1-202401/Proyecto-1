package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminPanel extends JPanel {

    private JButton viewPiecesButton;
    private JButton viewUsersButton;
    private JButton addUserButton;
    private JButton viewPurchaseOffersButton;
    private JButton approveOfferButton;
    private JButton denyOfferButton;
    private JButton registerSoldPieceButton;
    private JButton viewArtistPiecesButton;
    private JButton viewBuyerPiecesButton;
    private JButton exitButton;
    private ArtGalleryLogin parentFrame;

    public AdminPanel(ArtGalleryLogin parentFrame) {
        this.parentFrame = parentFrame;
        setLayout(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();

        JPanel panel = new JPanel(new GridBagLayout());

        // Botón "Ver piezas"
        viewPiecesButton = new JButton("Ver piezas");
        viewPiecesButton.addActionListener(new ViewPiecesButtonListener());

        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.insets = new Insets(10, 10, 10, 10);
        panel.add(viewPiecesButton, constraints);

        // Botón "Ver usuarios"
        viewUsersButton = new JButton("Ver usuarios");
        viewUsersButton.addActionListener(new ViewUsersButtonListener());

        constraints.gridy = 1;
        panel.add(viewUsersButton, constraints);

        // Botón "Ingresar nuevo usuario"
        addUserButton = new JButton("Ingresar nuevo usuario");
        addUserButton.addActionListener(new AddUserButtonListener());

        constraints.gridy = 2;
        panel.add(addUserButton, constraints);

        // Botón "Ver ofertas de compra"
        viewPurchaseOffersButton = new JButton("Ver ofertas de compra");
        viewPurchaseOffersButton.addActionListener(new ViewPurchaseOffersButtonListener());

        constraints.gridy = 3;
        panel.add(viewPurchaseOffersButton, constraints);

        // Botón "Aprobar oferta de compra"
        approveOfferButton = new JButton("Aprobar oferta de compra");
        approveOfferButton.addActionListener(new ApproveOfferButtonListener());

        constraints.gridy = 4;
        panel.add(approveOfferButton, constraints);

        // Botón "Denegar oferta de compra"
        denyOfferButton = new JButton("Denegar oferta de compra");
        denyOfferButton.addActionListener(new DenyOfferButtonListener());

        constraints.gridy = 5;
        panel.add(denyOfferButton, constraints);

        // Botón "Registrar pieza vendida"
        registerSoldPieceButton = new JButton("Registrar pieza vendida");
        registerSoldPieceButton.addActionListener(new RegisterSoldPieceButtonListener());

        constraints.gridy = 6;
        panel.add(registerSoldPieceButton, constraints);

        // Botón "Ver piezas de un artista"
        viewArtistPiecesButton = new JButton("Ver piezas de un artista");
        viewArtistPiecesButton.addActionListener(new ViewArtistPiecesButtonListener());

        constraints.gridy = 7;
        panel.add(viewArtistPiecesButton, constraints);

        // Botón "Ver piezas de un comprador"
        viewBuyerPiecesButton = new JButton("Ver piezas de un comprador");
        viewBuyerPiecesButton.addActionListener(new ViewBuyerPiecesButtonListener());

        constraints.gridy = 8;
        panel.add(viewBuyerPiecesButton, constraints);

        // Botón "Salir"
        exitButton = new JButton("Salir");
        exitButton.addActionListener(new ExitButtonListener());

        constraints.gridy = 9;
        panel.add(exitButton, constraints);

        add(panel, BorderLayout.CENTER);
    }

    private class ViewPiecesButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(AdminPanel.this, "Ver piezas...");
        }
    }

    private class ViewUsersButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(AdminPanel.this, "Ver usuarios...");
        }
    }

    private class AddUserButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(AdminPanel.this, "Ingresar nuevo usuario...");
        }
    }

    private class ViewPurchaseOffersButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(AdminPanel.this, "Ver ofertas de compra...");
        }
    }

    private class ApproveOfferButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(AdminPanel.this, "Aprobar oferta de compra...");
        }
    }

    private class DenyOfferButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(AdminPanel.this, "Denegar oferta de compra...");
        }
    }

    private class RegisterSoldPieceButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(AdminPanel.this, "Registrar pieza vendida...");
        }
    }

    private class ViewArtistPiecesButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(AdminPanel.this, "Ver piezas de un artista...");
        }
    }

    private class ViewBuyerPiecesButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(AdminPanel.this, "Ver piezas de un comprador...");
        }
    }

    private class ExitButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            parentFrame.showMainMenu();
        }
    }
}
