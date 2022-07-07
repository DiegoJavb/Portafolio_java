package test;

import dominio.Persona;
import java.util.Scanner;

public class PersonaPrueba {

    public static void main(String[] args) {
        
        Persona persona1 = new Persona("Diego", 5000.00, false);
        Persona persona2 = new Persona("Juan", 1212.00, true);
        System.out.println("PERSONA 1");
        System.out.println(persona1);
        System.out.println("\nPERSONA 2");
        System.out.println(persona2);
        System.out.println("\nPERSONA 2 CON CAMBIOS");
        persona2.setNombre("Juan carlos solis");
        persona2.setSueldo(10000.00);
        persona2.setEliminado(false);
        System.out.println(persona2);
    }
}
