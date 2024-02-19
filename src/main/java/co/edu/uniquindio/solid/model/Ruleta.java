package co.edu.uniquindio.solid.model;
import java.util.Random;

import co.edu.uniquindio.solid.service.IGestionRuleta;


public class Ruleta extends Juego implements IGestionRuleta {
    private final int  maxJugadores = 9;
    
    public Ruleta(String nombreJuego, int numeroJugadores, int numeroMesa) {
        super(nombreJuego, numeroJugadores, numeroMesa);
        
    }
    @Override
    public void girarRuleta() {
        System.out.println("Se está girando la ruleta");
        int numeroRadom = generarNumero(); 
        System.out.println( numeroRadom + " es el número ganador");
        System.out.println("Color" + determinarColor(numeroRadom));
    }
    int generarNumero(){
        Random random = new Random();
        return random.nextInt(37);
    }
    public static String determinarColor(int numero) {
        if (numero == 0) {
            return "Verde";
        } else if (numero == 1 || numero == 3 || numero == 5 || numero == 7 || numero == 9 || numero == 12 ||
                   numero == 14 || numero == 16 || numero == 18 || numero == 19 || numero == 21 || numero == 23 ||
                   numero == 25 || numero == 27 || numero == 30 || numero == 32 || numero == 34 || numero == 36) {
            return "Rojo";
        } else {
            return "Negro";
        }
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
