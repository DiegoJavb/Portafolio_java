package Packete1;

import Packete1.Clase1;
import Packete1.ClaseHija;

/**
 *
 * @author Diego
 */
public class TestModificadoresAcceso {

    public static void main(String[] args) {
        Clase1 clase1 = new Clase1("publico");
        clase1.setAtributoPrivate("cambio");
        System.out.println("clase1 con cambio= " + clase1.getAtributoPrivate());
    }
}
