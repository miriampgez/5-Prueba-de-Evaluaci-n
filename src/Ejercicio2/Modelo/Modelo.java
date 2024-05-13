package Ejercicio2.Modelo;

import java.util.*;
import Ejercicio2.Vista.Vista;

public class Modelo {
    private List<DigitalMedia> listaMedios;

    public Modelo() {
        this.listaMedios = new ArrayList<>();
    }

    public void addMedio(DigitalMedia medio) {
        listaMedios.add(medio);
    }

    public void buscar(String palabraClave) {
        EstrategiaBusqueda estrategia = new EstrategiaBusqueda();
        List<DigitalMedia> resultados = estrategia.buscar(listaMedios, palabraClave);
        Vista.mostrarResultados(resultados);
    }
}
