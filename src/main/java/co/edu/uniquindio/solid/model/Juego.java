package co.edu.uniquindio.solid.model;

public abstract class Juego {

    private String nombreJuego;
    private int numeroJugadores;
    private int numeroMesa;

    public Juego(String nombreJuego, int numeroJugadores, int numeroMesa) {
        this.nombreJuego = nombreJuego;
        this.numeroJugadores = numeroJugadores;
        this.numeroMesa = numeroMesa;
    }
    public abstract void validarNumJugadores();

    public String getNombreJuego() {
        return nombreJuego;
    }
    public void setNombreJuego(String nombreJuego) {
        this.nombreJuego = nombreJuego;
    }
    public int getNumeroJugadores() {
        return numeroJugadores;
    }
    public void setNumeroJugadores(int numeroJugadores) {
        this.numeroJugadores = numeroJugadores;
    }
    public int getNumeroMesa() {
        return numeroMesa;
    }
    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }
    
}
