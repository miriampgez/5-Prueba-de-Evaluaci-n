package Ejercicio2.Modelo;

import java.util.*;

public class EstrategiaBusquedaSimple implements EstrategiaBusqueda {
    @Override
    public List<DigitalMedia> buscar(List<DigitalMedia> lista, String palabraClave) {
        List<DigitalMedia> resultado = new ArrayList<>();
        for (DigitalMedia media : lista) {
            if (media.toString().toLowerCase().contains(palabraClave.toLowerCase())){
                resultado.add(media);
            }
        }
        return resultado;
    }
}
