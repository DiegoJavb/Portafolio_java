package ec.com.gm.peliculas.datos;

import ec.com.gm.peliculas.domain.Pelicula;
import ec.com.gm.peliculas.excepciones.*;
import java.util.List;

public interface IAccesoDatos {

    boolean existe(String nombreArchivo) throws AccesoDatosEx;

    List<Pelicula> listar(String nombre) throws LecturaDatosEx;

    void Escribir(Pelicula pelicula, String nobreArchivo, boolean anexar) throws EscrituraDatosEx;

    String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx;

    void crear(String nombreArchivo) throws AccesoDatosEx;

    void borrar(String nombreArchivo) throws AccesoDatosEx;

}
