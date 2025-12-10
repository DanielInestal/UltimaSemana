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
    private Persona (String nombre, String apellidos, String email, int edad) {
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

    public String getApellidos() {
        return apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public static Persona factory(String cadena) {
        String partes[] = cadena.trim().split(",");

        if (partes.length != 4)
            return null;
        try {
            int edad = Integer.parseInt(partes[3]);
            return new Persona(partes[0], partes[1], partes[2], edad);
        }
        catch (Exception e) {
            return null;
        }
    }    
}
