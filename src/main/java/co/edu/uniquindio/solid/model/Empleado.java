package co.edu.uniquindio.solid.model;

import co.edu.uniquindio.solid.service.IGestionTrabajador;

public abstract class  Empleado implements IGestionTrabajador {
    
    private String nombre;
    private int id;
    private String cargo;
    private String email;
    
    public Empleado() {
    }
    
    public Empleado(String nombre, int id, String cargo, String email) {
        this.nombre = nombre;
        this.id = id;
        this.cargo = cargo;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }    
}
