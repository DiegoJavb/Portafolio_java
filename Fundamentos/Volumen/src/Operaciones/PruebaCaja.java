package Operaciones;

/**
 *
 * @author Diego
 */
public class PruebaCaja {

    public static void main(String[] args) {
        int alto = 2;
        int ancho = 3;
        int profundo = 6;
        Caja caja0 = new Caja();      
        Caja caja = new Caja(alto, ancho, profundo);
        caja0.alto = alto;
        caja0.ancho = ancho;
        caja0.profundo = profundo;
        int resultado = caja0.volumen();
        System.out.println("resultado = " + resultado);
        resultado = caja.volumen();
        System.out.println("resultado = " + resultado);
    }
}
