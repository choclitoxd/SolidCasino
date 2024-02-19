package co.edu.uniquindio.solid.model;
import co.edu.uniquindio.solid.service.IGestionCartas;
public class Poker extends Juego implements IGestionCartas {
    private float apuestaBase = 50000;
    private final int  maxJugadores = 6;
    public Poker(String nombreJuego, int numeroJugadores, int numeroMesa) {
        super(nombreJuego,numeroJugadores, numeroMesa);
    }
    @Override
    public void repartirCartas() {
        System.out.println("Repartiendo cartas para el juego de Poker");
        System.out.println("Monto base es de"+ apuestaBase);
        System.out.println("Se repartirán "+ (2*getNumeroJugadores()) + " cartas por jugador.");
        System.out.println("Comenzando el juego de Poker");
        
    } 
    @Override
    public void validarNumJugadores() {
        if(getNumeroJugadores() > maxJugadores){
            throw new IllegalArgumentException("El juego solo puede tener máximo "+maxJugadores+" jugadores");
            }else{
                System.out.println("El número de jugadores esta bien");
            }
    }
    

    
}
