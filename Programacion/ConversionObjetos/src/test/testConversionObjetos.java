package test;

import domain.*;

/**
 *
 * @author Diego
 */
public class testConversionObjetos {

    public static void main(String[] args) {
        Empleado empleado;
        empleado = new Escritor("Diego", 525.50, TipoEscritura.CLASICO);

        System.out.println(empleado.obtenerDetalles());
        //Down Casting
        //((Escritor) empleado).getTipoEscritura();

        //Up
        Escritor escritor = (Escritor) empleado;
        escritor.getTipoEscritura();

        Empleado empleado2 = escritor;
        System.out.println("empleado2 = " + empleado2.obtenerDetalles());
    }

}
