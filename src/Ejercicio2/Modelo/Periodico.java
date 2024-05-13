package Ejercicio2.Modelo;

public class Periodico implements DigitalMedia {
    private String titulo;

    public Periodico(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Periódico " + titulo);
    }
}