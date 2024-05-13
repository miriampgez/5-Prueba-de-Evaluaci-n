package Ejercicio2.Modelo;

import java.util.ArrayList;
import java.util.List;

public class ColeccionMedios implements DigitalMedia {
    private List<DigitalMedia> listaMedios = new ArrayList<>();

    public void add(DigitalMedia medio) {
        listaMedios.add(medio);
    }

    @Override
    public void mostrarInformacion() {
        for (DigitalMedia medio : listaMedios) {
            medio.mostrarInformacion();
        }
    }
}
