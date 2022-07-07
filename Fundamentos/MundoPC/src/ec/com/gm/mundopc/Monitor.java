package ec.com.gm.mundopc;

public class Monitor {

    private final int idMonitor;
    private String marca;
    private double tamano;
    private static int contadorMonbitores;

    private Monitor() {
        this.idMonitor = ++Monitor.contadorMonbitores;
    }

    public Monitor(String marca, double tamaño) {
        this();
        this.marca = marca;
        this.tamano = tamaño;
    }

    public int getIdMonitor() {
        return idMonitor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamaño() {
        return tamano;
    }

    public void setTamaño(double tamaño) {
        this.tamano = tamaño;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Monitor{");
        sb.append("\nidMonitor=").append(idMonitor);
        sb.append(",\nmarca=").append(marca);
        sb.append(",\ntamano=").append(tamano);
        sb.append(",\n}");
        return sb.toString();
    }

}
