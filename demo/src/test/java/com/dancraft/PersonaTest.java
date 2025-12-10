package com.dancraft;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonaTest {
    @Test
    void testFactory() {
        Persona persona = Persona.factory("Alfonso,Gonzalez Briones,Alfonso@gmail.com,46");
        assertNotNull(persona);
        assertEquals("Alfonso", persona.getNombre());
        assertEquals("Gonzalez Briones", persona.getApellidos());
        assertEquals("Alfonso@gmail.com", persona.getEmail());
        assertEquals(46, persona.getEdad());
    }
}
