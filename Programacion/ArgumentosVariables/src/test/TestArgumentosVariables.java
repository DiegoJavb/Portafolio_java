package test;

public class TestArgumentosVariables {

    public static void main(String[] args) {
        imprimirNumeros(3, 4, 5, 6, 7, 54, 1, 12, 3);
        imprimirNumeros(32, 34, 5, 6, 1);
        variosParametros("Diego Bacuy\n", 2, 3, 4);
    }

    private static void variosParametros(String nombre, int... numeros) {
        System.out.println("nombre = " + nombre);
        imprimirNumeros(numeros);
    }

    private static void imprimirNumeros(int... numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("i: " + i + " => " + numeros[i]);
        }
        System.out.println("ancho: " + numeros.length + '\n');
    }
}
