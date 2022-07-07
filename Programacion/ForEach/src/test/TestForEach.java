package test;

import domain.Persona;

public class TestForEach {

    public static void main(String[] args) {
        int edades[] = {5, 4, 8, 9, 1, 3};
        for (int edad : edades) {
            System.out.println("edad = " + edad);
        }
        Persona personas[] = {new Persona("Juan"), new Persona("Karla"), new Persona("Agustin")};
        for (Persona persona : personas) {
            System.out.println("persona = " + persona);
        }
    }

}
