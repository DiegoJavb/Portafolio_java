package test;

import static aritmetica.Aritmetica.division;
import excepciones.OperacionExcepcion;

public class testExcepciones {

    public static void main(String[] args) {
        /*en la actualidad se recomienda utilizar el RuntimeException
        ya que permite que nuestro codigo se vea mejor; de esta manera se recommienda
        unicamente utilizar el try-catch en codigo donde sabemos que puede 
        ocurrir un error.
         */
        int resultado = 0;
        try {
            resultado = division(10, 0);
        } catch (OperacionExcepcion e) {
            System.out.println("Ocurrio un erro de tipo OperacioExcepcion");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocurrio un error de tipo Excepcion");
//            e.printStackTrace(System.out);
            System.out.println(e.getMessage());
        } finally {
            /*utilizar finally significa que siempre se va a ejecutar este bloque
            tambien sirve para cerrar recursos e.g. si se ha abierto una base de datos
             */
            System.out.println("Se revisó la division entre cero");
        }
        System.out.println("resultado = " + resultado);

    }
}
