package org.example;
public class Monitor {
    private double pulgadas;
    private String marca;
    private String modelo;
    private String tipo;
    private double precio;
    private String estado;

    public Monitor(double pulgadas, String marca, String modelo, String tipo, double precio, String estado) {
        this.pulgadas = pulgadas;
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.precio = precio;
        this.estado = estado;
    }

    public double getPulgadas() {
        return this.pulgadas;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String toString() {
        return "Monitor{pulgadas=" + this.pulgadas + ", marca='" + this.marca + "', modelo='" + this.modelo + "', tipo='" + this.tipo + "', precio=" + this.precio + ", estado='" + this.estado + "'}";
    }

    public void encender() {
        this.estado = "Encendido...";
        System.out.println(" El monitor se esta encendiendo\n Estado del monitor: " + this.estado);
    }

    public void apagar() {
        this.estado = "Apagado...";
        System.out.println(" El monitor se apago\n Estado del monitor: " + this.estado);
    }

    public void PantallaNegra() {
        this.estado = "Perdio señal";
        System.out.println("El monitor dio un pantallazo\n Estado del monitor: " + this.estado);
    }
}
