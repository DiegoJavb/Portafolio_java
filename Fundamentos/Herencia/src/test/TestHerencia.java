package test;

import domain.Cliente;
import domain.Empleado;
import java.util.Date;

public class TestHerencia {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Diego", 5000.0);
//        var fecha = new Date();
//        Cliente cliente1 = new Cliente(fecha, true, "Diego", 'M', 28, "Quito");
        System.out.println("empleado1 = " + empleado1);
//        System.out.println("cliente1 = " + cliente1);
    }
}
