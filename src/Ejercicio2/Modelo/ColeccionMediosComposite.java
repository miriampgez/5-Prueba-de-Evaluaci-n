package Ejercicio2.Modelo;

import java.util.*;

public class ColeccionMediosComposite implements DigitalMedia {
    private List<DigitalMedia> medios = new ArrayList<>();

    public void addMedio(DigitalMedia medio) {
        medios.add(medio);
    }

    @Override
    public void mostrarInformacion() {
        for (DigitalMedia medio : medios) {
            medio.mostrarInformacion();
        }
    }
}
