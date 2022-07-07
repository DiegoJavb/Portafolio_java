package test;

import domain.Persona;

public class TestMatrices {

    public static void main(String[] args) {
        int edades[][] = new int[3][2];
        edades[0][0] = 5;
        edades[0][1] = 7;
        edades[1][0] = 8;
        edades[1][1] = 4;
        edades[2][0] = 1;
        edades[2][1] = 9;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(edades[i][j]);
//                System.out.println("\n");
            }
            System.out.println("\n");
        }
        int numeros[] = new int[4];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("i = " + i);
        }
//        String frutas[][] = new String[3][2];
        String frutas[][] = {{"Manzana", "Limon"}, {"Pera", "Fresa", "uva"}, {"banano"}};
        imprimir(frutas);
        Persona personas[][] = new Persona[2][3];
        personas[0][0] = new Persona("Diego");
        personas[0][1] = new Persona("Javier");
        imprimir(personas);

    }

    public static void imprimir(Object matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Posicion: [" + i + "][" + j + "]; " + "matriz: " + matriz[i][j]);
            }
        }
    }
}
