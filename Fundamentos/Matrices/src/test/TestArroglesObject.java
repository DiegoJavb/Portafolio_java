package test;

import domain.Persona;

public class TestArroglesObject {

    public static void main(String[] args) {
        Persona personas[] = new Persona[2];
        personas[0] = new Persona("Diego");
        personas[1] = new Persona("Pedro");
        for (int i = 0; i < personas.length; i++) {
            System.out.println("Nombre : " + personas[i].getNombre());
        }
        String frutas[] = {"higo", "uva", "pera", "manzana"};
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("fruta " + i + " = " + frutas[i]);
        }

    }
}
