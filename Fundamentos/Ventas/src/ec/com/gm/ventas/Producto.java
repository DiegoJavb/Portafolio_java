package ec.com.gm.ventas;

public class Producto {

    private final int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProducto;

    private Producto() {
        this.idProducto = ++Producto.contadorProducto;
    }

    public Producto(String nombre, double precio) {
        this();
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Producto{");
        sb.append("\nidProducto=").append(idProducto);
        sb.append(",\n nombre=").append(nombre);
        sb.append(",\n precio=").append(precio);
        sb.append("\n}");
        return sb.toString();
    }

}
