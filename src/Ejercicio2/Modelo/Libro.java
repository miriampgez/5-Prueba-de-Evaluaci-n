package Ejercicio2.Modelo;

public class Libro implements DigitalMedia {
    private String titulo;

    public Libro(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Libro" + titulo);
    }
}