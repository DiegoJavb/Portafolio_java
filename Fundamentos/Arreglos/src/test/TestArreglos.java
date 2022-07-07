package test;

public class TestArreglos {

    public static void main(String[] args) {
        int edades[] = new int[3];
        System.out.println("edades = " + edades);
        for (int i = 0; i < edades.length; i++) {
            edades[i] = i;
            System.out.println("i = " + edades[i]);
        }
    }
}
