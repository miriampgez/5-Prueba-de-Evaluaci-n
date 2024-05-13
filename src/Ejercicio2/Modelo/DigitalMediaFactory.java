package Ejercicio2.Modelo;

public class DigitalMediaFactory {
    public DigitalMedia crearMedioDigital(String tipo, String titulo) {
        switch (tipo.toLowerCase()) {
            case "libro":
                return new Libro(titulo);
            case "revista":
                return new Revista(titulo);
            case "periódico":
                return new Periodico(titulo);
            default:
                throw new IllegalArgumentException("Tipo no válido" + tipo);
        }
    }
}

