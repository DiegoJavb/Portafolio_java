package test;

import static manejoarchivos.ManejoArchivos.*;

public class TestManejoArchivos {
    
    public static void main(String[] args) {
        var nombreArchivo = "prueba.txt";
//        crearArchivo(nombreArchivo);
//        anexarArchivo(nombreArchivo, "Hola desde java");
//        anexarArchivo(nombreArchivo, "adios");

        leerArchivo(nombreArchivo);
    }
}
