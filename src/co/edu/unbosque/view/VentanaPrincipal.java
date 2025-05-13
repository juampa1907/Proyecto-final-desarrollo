package co.edu.unbosque.view;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {
    private JButton botonSimular;
    private JPanel panelGrid;
    private JLabel[][] celdas;

    public VentanaPrincipal(Runnable accionSimular) {
        setTitle("Simulación de Tráfico");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        botonSimular = new JButton("Simular Turno");
        add(botonSimular, BorderLayout.SOUTH);

        panelGrid = new JPanel(new GridLayout(5, 5));
        celdas = new JLabel[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                celdas[i][j] = new JLabel(" ", SwingConstants.CENTER);
                celdas[i][j].setBorder(BorderFactory.createLineBorder(Color.BLACK));
                panelGrid.add(celdas[i][j]);
            }
        }

        add(panelGrid, BorderLayout.CENTER);

        botonSimular.addActionListener(e -> accionSimular.run());
    }

    public void actualizarVista(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++)
            for (int j = 0; j < matriz[i].length; j++)
                celdas[i][j].setText(matriz[i][j]);
    }
}