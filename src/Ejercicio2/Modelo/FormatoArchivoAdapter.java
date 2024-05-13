package Ejercicio2.Modelo;

public class FormatoArchivoAdapter implements DigitalMedia {
    private DigitalMedia archivo;

    public FormatoArchivoAdapter(DigitalMedia archivo) {
        this.archivo = archivo;
    }

    @Override
    public void mostrarInformacion() {
        archivo.mostrarInformacion();
    }
}
