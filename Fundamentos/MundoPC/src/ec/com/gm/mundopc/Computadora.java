package ec.com.gm.mundopc;

public class Computadora {

    private final int idComputadora;
    private String nombre;
    private Raton raton;
    private Teclado teclado;
    private Monitor monitor;
    private static int contadorComputadora;

    private Computadora() {
        this.idComputadora = ++Computadora.contadorComputadora;
    }

    public Computadora(String nombre, Raton raton, Teclado teclado, Monitor monitor) {
        this();
        this.nombre = nombre;
        this.raton = raton;
        this.teclado = teclado;
        this.monitor = monitor;
    }

    public Monitor getMonitor() {
        return this.monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Raton getRaton() {
        return this.raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    public Teclado getTeclado() {
        return this.teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public int getIdComputadora() {
        return this.idComputadora;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Computadora{");
        sb.append("idComputadora=").append(idComputadora);
        sb.append(",\nnombre=").append(nombre);
        sb.append(",\nraton=").append(raton);
        sb.append(",\nteclado=").append(teclado);
        sb.append(",\nmonitor=").append(monitor);
        sb.append(",\n}");
        return sb.toString();
    }

}
