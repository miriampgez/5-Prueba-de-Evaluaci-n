package Ejercicio2.Modelo;

import java.util.*;

public class Mediador {
    private List<Usuario> usuarios = new ArrayList<>();
    private List<Observer> observadores = new ArrayList<>();

    public void addUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void addObservador(Observer observador) {
        observadores.add(observador);
    }

    public void notificar() {
        for (Observer observador : observadores) {
            observador.actualizar();
        }
    }
}
