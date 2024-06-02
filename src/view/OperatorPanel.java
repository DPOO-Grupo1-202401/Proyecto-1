package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OperatorPanel extends JPanel {

    private JButton viewPiecesButton;
    private JButton registerOfferButton;
    private JButton viewArtistPiecesButton;
    private JButton exitButton;
    private ArtGalleryLogin parentFrame;

    public OperatorPanel(ArtGalleryLogin parentFrame) {
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

        // Botón "Registrar oferta"
        registerOfferButton = new JButton("Registrar oferta");
        registerOfferButton.addActionListener(new RegisterOfferButtonListener());

        constraints.gridy = 1;
        panel.add(registerOfferButton, constraints);

        // Botón "Ver piezas de un artista"
        viewArtistPiecesButton = new JButton("Ver piezas de un artista");
        viewArtistPiecesButton.addActionListener(new ViewArtistPiecesButtonListener());

        constraints.gridy = 2;
        panel.add(viewArtistPiecesButton, constraints);

        // Botón "Salir"
        exitButton = new JButton("Salir");
        exitButton.addActionListener(new ExitButtonListener());

        constraints.gridy = 3;
        panel.add(exitButton, constraints);

        add(panel, BorderLayout.CENTER);
    }

    private class ViewPiecesButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(OperatorPanel.this, "Ver piezas...");
        }
    }

    private class RegisterOfferButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(OperatorPanel.this, "Registrar oferta...");
        }
    }

    private class ViewArtistPiecesButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(OperatorPanel.this, "Ver piezas de un artista...");
        }
    }

    private class ExitButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            parentFrame.showMainMenu();
        }
    }
}
