package test;

import domain.*;

/**
 *
 * @author Diego
 */
public class testClasesAbstractas {

    public static void main(String[] args) {
//        FiguraGeometrica figura = new FiguraGeometrica();
        FiguraGeometrica figura = new Rectangulo("Rectangulo");
        figura.dibujar();
    }
}
