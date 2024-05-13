package Ejercicio2.Modelo;

public class DescargarCommand implements Command {
    private DigitalMedia medio;

    public DescargarCommand(DigitalMedia medio) {
        this.medio = medio;
    }

    @Override
    public void execute() {
       System.out.println("Descargando...");
        medio.mostrarInformacion();
    }
}
