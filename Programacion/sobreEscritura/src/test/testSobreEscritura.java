package test;

import domain.*;

/**
 *
 * @author Diego
 */
public class testSobreEscritura {

    public static void main(String[] args) {
//        Gerente gerente1 = new Gerente("Diego", 450.50, "Ventas");
//        System.out.println("Gerente 1: " + gerente1.obtenerDetalles());

        Empleado empleado = new Empleado("Juan", 600.50);
//        System.out.println("empleado = " + empleado.obtenerDetalles());

        Gerente gerente = new Gerente("karla", 7000.50, "Marketing");
//        System.out.println("gerente = " + gerente.obtenerDetalles());

        imprimir(empleado);
        imprimir(gerente);

    }

    public static void imprimir(Empleado empleado) {
        System.out.println("empleado = " + empleado.obtenerDetalles());
    }
}
