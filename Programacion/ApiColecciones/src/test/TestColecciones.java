package test;

import java.util.*;

public class TestColecciones {

    public static void main(String[] args) {
        List miLista = new ArrayList();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        imprimir(miLista);
        System.out.println("....................");
        Set miSet = new HashSet();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        imprimir(miSet);
        System.out.println("..........................");
        Map miMapa = new HashMap();
        miMapa.put("valor1", "Juan");
        miMapa.put("valor2", "Diego");
        miMapa.put("valor3", "Pedro");

        String elemento = (String) miMapa.get("valor1");
        System.out.println("elemento = " + elemento);
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
    }

    public static void imprimir(Collection miColeccion) {
        miColeccion.forEach(element -> {
            System.out.println("dia = " + element);
        });
    }
}
