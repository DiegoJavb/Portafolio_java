package palabrathis;

/**
 *
 * @author Diego
 */
public class PalabraThis {

    public static void main(String[] args) {
        Persona persona = new Persona("Diego", "Bacuy");
        System.out.println("persona = " + persona);
        System.out.println("Nombre: " + persona.nombre);
        System.out.println("Apellido: " + persona.apellido);

    }
}

class Persona {

    String nombre;
    String apellido;

    Persona(String nombre, String apellido) {
        //super(); llamda implicita al constructor de la clase padre (Object)
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Objeto persona usando this: " + this);
        new Imprimir().imprimir(this);
    }
}

class Imprimir {

    public void imprimir(Persona persona) {
        System.out.println("persona desde imprimir: " + persona);
        System.out.println("Impresion del objeto actual (this): " + this);
    }
}
