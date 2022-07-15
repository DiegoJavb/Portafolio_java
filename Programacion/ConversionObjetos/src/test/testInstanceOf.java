package test;

import domain.*;

/**
 *
 * @author Diego
 */
public class testInstanceOf {

    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", 600.50);
//        determinarTipo(empleado);

        empleado = new Gerente("karla", 7000.50, "Marketing");
        determinarTipo(empleado);
    }

    public static void determinarTipo(Empleado empleado) {
        if (empleado instanceof Gerente) {
            System.out.println("Es de tipo Gerente ");
            Gerente gerente = (Gerente) empleado;
            System.out.println("departamento = " + gerente.getDepartamento());
        } else if (empleado instanceof Empleado) {
            System.out.println("Es de tipo Empleado");
        } else if (empleado instanceof Object) {
            System.out.println("Es de tipo Object");
        }
    }
}
