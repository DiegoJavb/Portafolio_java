package pasoporreferencia;

import clases.Persona;

/**
 *
 * @author Diego
 */
public class PasoPorReferencia {

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Diego";
        System.out.println("persona1 = " + persona1.nombre);
        persona1 = cambiaValor(persona1);
        System.out.println("persona1 cambio nombre= " + persona1.nombre);
    }

    public static Persona cambiaValor(Persona persona) {
        persona.nombre = "Pedro";
        return persona;
    }
}
