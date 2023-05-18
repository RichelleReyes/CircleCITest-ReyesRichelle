package org.example;

public class Alumno {
    private String nombre;
    private String apellido;

    public Alumno(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.length() > 0) {
            this.nombre = nombre;
        }
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        if (apellido.length() > 0) {
            this.apellido = apellido;
        }
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " Apellido: " + apellido;
    }
}