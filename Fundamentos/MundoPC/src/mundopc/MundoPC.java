package mundopc;

import ec.com.gm.mundopc.*;

public class MundoPC {

    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP", 13);
        Raton ratonHP = new Raton("bluetooth", "HP");
        Teclado tecladoHP = new Teclado("bluetooth", "HP");
        Computadora computadorHP = new Computadora("HP", ratonHP, tecladoHP, monitorHP);

        Monitor monitorGamer = new Monitor("Gamer", 13);
        Raton ratonGamer = new Raton("bluetooth", "Gamer");
        Teclado tecladoGamer = new Teclado("bluetooth", "Gamer");
        Computadora computadorGamer = new Computadora("Gamer", ratonGamer, tecladoHP, monitorGamer);
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadorHP);
        orden1.agregarComputadora(computadorGamer);
        orden1.mostrarOrden();
    }
}
