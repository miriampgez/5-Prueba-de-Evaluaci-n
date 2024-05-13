package Ejercicio2.Modelo;

public class Usuario implements Observer {
    private String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar() {
        System.out.println(nombre + " ¡Nueva actualizacion disponible!");
    }
}
