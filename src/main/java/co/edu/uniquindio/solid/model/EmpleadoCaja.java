package co.edu.uniquindio.solid.model;

public class EmpleadoCaja extends Empleado {
    public EmpleadoCaja(String nombre, int id, String cargo, String email){
        super(nombre, id, cargo, email);
    }

    @Override
    public void AsignacionTrabajo(String sitioTrabajo) {
        System.out.println("El empleado de caja " + getNombre() + " se ha asignado a trabajar en " + sitioTrabajo);
    }
}
