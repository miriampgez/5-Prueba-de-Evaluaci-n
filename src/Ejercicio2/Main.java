package Ejercicio2;

import Ejercicio2.Controlador.Controlador;
import Ejercicio2.Modelo.Libro;
import Ejercicio2.Modelo.Modelo;
import Ejercicio2.Modelo.Periodico;
import Ejercicio2.Modelo.Revista;
import Ejercicio2.Vista.Vista;

public class Main {
    public static void main(String[] args) {

        Modelo modelo = new Modelo();

        modelo.addMedio(new Libro("El Principito"));
        modelo.addMedio(new Revista("Hola"));
        modelo.addMedio(new Periodico("Noticias"));
        Vista vista = new Vista();
        Controlador controlador = new Controlador(vista, modelo);
        vista.setModelo(modelo);
    }
}
