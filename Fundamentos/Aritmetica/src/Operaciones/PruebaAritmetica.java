package Operaciones;

/**
 *
 * @author Diego
 */
public class PruebaAritmetica {

    public static void main(String[] args) {
        //variables locales
        int a = 10;
        int b = 2;
        miMetodo();
        Aritmetica aritmetica1 = new Aritmetica();
        System.out.println("aritmetica1 a: " + aritmetica1.a);
        System.out.println("aritmetica1 b: " + aritmetica1.b);

        Aritmetica aritmetica2 = new Aritmetica(a, b);
        System.out.println("aritmetica2 :a " + aritmetica2.a);
        System.out.println("aritmetica2 :b " + aritmetica2.b);
    }

    public static void miMetodo() {
        // la variable esta fuera del alcance donde fue definida
        // a = 12;
        System.out.println("otro metodo");
    }
}
