package Ejercicio2.Modelo;

import java.util.*;

public class EstrategiaOrdenAlfabetico implements EstrategiaBusqueda {
    @Override
    public List<DigitalMedia> buscar(List<DigitalMedia> lista, String palabraClave) {
        lista.sort((m1, m2) -> m1.toString().compareToIgnoreCase(m2.toString()));
        return lista;
    }
}
