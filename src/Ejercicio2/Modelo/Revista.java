package Ejercicio2.Modelo;

public class Revista implements DigitalMedia {
    private String titulo;

    public Revista(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Revista" + titulo);
    }
}
