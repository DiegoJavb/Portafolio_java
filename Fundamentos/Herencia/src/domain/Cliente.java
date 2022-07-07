package domain;

import java.util.Date;

public class Cliente extends Persona {

    protected int idCliente;
    protected Date fechaRegistro;
    protected boolean vip;
    private static int contadorCliente;

    public Cliente(Date fechaRegistro, boolean vip, String nombre,
            char genero, int edad, String direccion) {
        super(nombre, genero, edad, direccion);
        this.idCliente = ++Cliente.contadorCliente;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }

    public Cliente(String nombre) {
//        super(nombre, genero, edad, direccion);
        super(nombre);
        this.fechaRegistro = new Date();
        this.idCliente = ++Cliente.contadorCliente;
        this.vip = true;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("\nidCliente=").append(idCliente);
        sb.append(",\nfechaRegistro=").append(fechaRegistro);
        sb.append(",\nvip=").append(vip);
        sb.append(",\nPersona :{").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

}
