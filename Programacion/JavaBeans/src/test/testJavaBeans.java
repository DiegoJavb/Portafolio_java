package test;

import domain.Persona;

/**
 *
 * @author Diego
 */
public class testJavaBeans {

    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Diego");
        persona.setApellido("Bacuy");
        System.out.println("persona = " + persona.toString());
        System.out.println("nombre = " + persona.getNombre());
        System.out.println("apeliido = " + persona.getApellido());
    }
}
