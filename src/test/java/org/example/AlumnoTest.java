package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlumnoTest {

    @Test
    void getNombre() {
        Alumno alumno = new Alumno("Juan", "Perez");
        assertEquals("Juan", alumno.getNombre());
    }

    @Test
    void setNombre() {
        Alumno alumno = new Alumno("Juan", "Perez");
        alumno.setNombre("Pedro");
        assertEquals("Pedro", alumno.getNombre());
    }

    @Test
    void getApellido() {
        Alumno alumno = new Alumno("Juan", "Perez");
        assertEquals("Perez", alumno.getApellido());
    }

    @Test
    void setApellido() {
        Alumno alumno = new Alumno("Juan", "Perez");
        alumno.setApellido("Gomez");
        assertEquals("Gomez", alumno.getApellido());
    }

    @Test
    void testToString() {
        Alumno alumno = new Alumno("Juan", "Perez");
        assertEquals("Nombre: Juan Apellido: Perez", alumno.toString());
    }
}