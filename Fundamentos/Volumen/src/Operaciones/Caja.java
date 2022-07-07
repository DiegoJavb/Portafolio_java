package Operaciones;

/**
 *
 * @author Diego
 */
public class Caja {

    // Atributos
    int ancho;
    int alto;
    int profundo;

    // Constructores
    public Caja() {
        System.out.println("Calculo de volumen sin argumentos");
    }

    public Caja(int ancho, int alto, int profundo) {
        System.out.println("calculo de volumen con argumentos");
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }

    //Metodos
    public int volumen() {
        return ancho * alto * profundo;
    }
}
