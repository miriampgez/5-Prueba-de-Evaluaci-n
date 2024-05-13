package Ejercicio2.Vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import Ejercicio2.Controlador.Controlador;
import Ejercicio2.Modelo.DigitalMedia;
import Ejercicio2.Modelo.Modelo;



public class Vista {
    private Controlador controlador;
    private Modelo modelo;
    private JTextField campoBusqueda;
    private JTextArea areaResultados = new JTextArea();

    public Vista() {
        JFrame frame = new JFrame("Biblioteca Digital");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        campoBusqueda = new JTextField();
        JButton botonBuscar = new JButton("Buscar");

        JPanel panelBusqueda = new JPanel();
        panelBusqueda.add(campoBusqueda);
        panelBusqueda.add(botonBuscar);

        frame.add(panelBusqueda, BorderLayout.NORTH);
        frame.add(new JScrollPane(areaResultados), BorderLayout.CENTER);

        botonBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String palabraClave = campoBusqueda.getText();
                controlador.buscar(palabraClave);
            }
        });

        frame.setVisible(true);
    }

    public void setControlador(Controlador controlador) {
        this.controlador = controlador;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public void mostrarResultados(List<DigitalMedia> resultados) {
        areaResultados.setText("");
        for (DigitalMedia medio : resultados) {
            areaResultados.append(medio.toString() + "\n");
        }
    }
}

