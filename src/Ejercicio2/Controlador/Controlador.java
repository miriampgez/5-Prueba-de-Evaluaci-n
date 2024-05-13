package Ejercicio2.Controlador;

import Ejercicio2.Modelo.Modelo;
import Ejercicio2.Vista.Vista;

public class Controlador {
    private Vista vista;
    private Modelo modelo;

    public Controlador(Vista vista, Modelo modelo) {
        this.vista = vista;
        this.modelo = modelo;

        vista.setControlador(this);
        vista.setModelo(modelo);
    }

    public void buscar(String palabraClave) {
        modelo.buscar(palabraClave);
    }
}
