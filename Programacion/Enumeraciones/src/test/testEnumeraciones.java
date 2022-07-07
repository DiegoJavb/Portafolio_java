package test;

import enumeracion.Continentes;
import enumeracion.Dias;

public class testEnumeraciones {

    public static void main(String[] args) {
//        System.out.println("dia 7: " + Dias.DOMINGO);
//        indicarDiaSemana(Dias.MARTES);

//        System.out.println("Continente no. 4: " + Continentes.AMERICA
//                + "\nPaises en el continente: " + Continentes.AMERICA.getPaises());
//        System.out.println("Continente no. 1: " + Continentes.AFRICA
//                + "\nPaises en el continente: " + Continentes.AFRICA.getPaises());
        indicarPaises(Continentes.AMERICA);
        indicarPaises(Continentes.AFRICA);
        indicarPaises(Continentes.OCEANIA);
    }

    private static void indicarDiaSemana(Dias dias) {
        switch (dias) {
            case LUNES ->
                System.out.println("primer dia de la semana");
            case MARTES ->
                System.out.println("segundo dia de la semana");
            default ->
                throw new AssertionError();
        }

    }

    private static void indicarPaises(Continentes continentes) {
        System.out.println("Continente: " + continentes
                + "\nPaises en el continente: " + continentes.getPaises());
    }

}
