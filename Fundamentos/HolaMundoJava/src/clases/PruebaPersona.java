package clases;

/**
 *
 * @author Diego
 */
public class PruebaPersona {

    public static void main(String[] args) {
        Persona persona1;
        persona1 = new Persona();
        persona1.nombre = "Juan";
        persona1.apellido = "Perez";
        persona1.desplegarInformacion();
        Persona persona2;
        persona2 = new Persona();
        persona2.nombre = "Diego";
        persona2.apellido = "Bacuy";
        persona2.desplegarInformacion();
        System.out.println("persona2 = " + persona2);
    }
}
