package test;

import domain.*;

/**
 *
 * @author Diego
 */
public class testClaseObject {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Diego", 5000);
        Empleado empleado2 = new Empleado("Diego", 5000);

        if (empleado1 == empleado2) {
            System.out.println("Tienen la misma referencia en memoria");
        } else {
            System.out.println("No tiene la misma referencia en memoria");
        }

        if (empleado1.equals(empleado2)) {
            System.out.println("Los objetos son iguales en contenido");
        } else {
            System.out.println("Los objetos no son iguales en contenido");
        }

        if (empleado1.hashCode() == empleado2.hashCode()) {
            System.out.println("El valor hashcode es igual");
        } else {
            System.out.println("El valor hashcode es distinto");
        }

    }
}
