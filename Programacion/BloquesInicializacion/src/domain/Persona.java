package domain;

public class Persona {

    private final int idPersona;
    private static int contadorPersonas;

    //bloque de inicializacion estatico
    //se va a inicializar antes del constructor
    //y antes de cualquier bloque de inicializacion no estatico
    //solo se utiliza la primera vez que se carga el progama en memoria
    static {
        System.out.println("Ejecucion de bloque estatico.");
        ++Persona.contadorPersonas;
        //idPersona = 10;
    }

    //bloque de inicializacion no estatico
    //se ejecuta antes del constructor de nuestra clase
    //se carga cada vez que se crea un objeto
    {
        System.out.println("Ejecucion de bloque NO estatico");
        this.idPersona = Persona.contadorPersonas++;
    }

    public Persona() {
        System.out.println("Ejecucion del constructor");
    }

    public int getIdPersona() {
        return idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }

}
