package Operaciones;

/**
 *
 * @author Diego
 */
public class Aritmetica {

    //Atributos
    int a;
    int b;

    //Constructir vacio
    public Aritmetica() {
        System.out.println("ejecutando constructor");
    }

    //Constructor lleno
    public Aritmetica(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("ejecutando constructor con argumentos");
    }

    //Metodos
    public void sumar() {
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }

    public int sumarConRetorno() {
        return a + b;
    }

    public int sumarConArgumentos(int a, int b) {
        this.a = a;
        this.b = b;
        // return a + b;
        return this.sumarConRetorno();
    }
}
