package co.edu.uniquindio.solid.model;

public class Croupier extends Empleado {

    public Croupier(String nombre, int id, String cargo, String email){
        super(nombre, id, cargo, email);
    }

    @Override
    public void AsignacionTrabajo(String sitioTrabajo) {
        System.out.println("El croupier " + getNombre() + ", con el ID: "+getId()+", ve a la mesa"+sitioTrabajo);
    }
    
}
