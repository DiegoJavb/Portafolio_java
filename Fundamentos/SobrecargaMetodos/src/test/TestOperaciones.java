package test;

import operaciones.Operaciones;

public class TestOperaciones {

    public static void main(String[] args) {
        var resultado = Operaciones.sumar(5, 3);
        System.out.println("resultado = " + resultado);
        var resultado2 = Operaciones.sumar(3, 9d);
        System.out.println("resultado = " + resultado2);
        var resultado3 = Operaciones.sumar(3, 9l);
        System.out.println("resultado = " + resultado3);
    }
}
