package com.dancraft;

/**
 * @author DanCraft
 */
public class Persona {
    private String nombre, apellidos, email;
    private int edad;
    

    /**
     * 
     * @param nombre Nombre
     * @param apellidos Apellidos
     * @param email Correo de persona
     * @param edad Edad persona
     */
    Persona (String nombre, String apellidos, String email, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.edad = edad;
    }

    /**
     * Getter de email
     * @return el email de la persona
     */
    public String getEmail() {
        return email;
    }
}
