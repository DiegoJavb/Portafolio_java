package domain;

public class Persona {

    private int idPersona;
    private String nombre;
    private static int contadorPersona;

    public Persona(String nombre) {
        this.nombre = nombre;
        //incrementar el contador por cada objeto nuevo
        Persona.contadorPersona++;
        //asignar el nuevo valor a la variable idPersona
        this.idPersona = Persona.contadorPersona;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getContadorPersonas() {
        return contadorPersona;
    }

    public static void setContadorPersonas(int contadorPersonas) {
        contadorPersona = contadorPersonas;
    }

    @Override
    public String toString() {
        return "["
                + "\n Id persona: " + this.idPersona
                + "\n nombre: " + this.nombre
                + "\n]";
    }
}
