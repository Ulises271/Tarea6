package org.example;
import java.awt.Color;

    public class Automovil {
        private String marca;
        private String subMarca;
        private int modelo;
        private Color color;
        private String estado;

        public Automovil() {
            this.marca = "";
            this.subMarca = "";
            this.modelo = 0;
            this.color = Color.GREEN;
            this.estado = "";
        }

        public Automovil(String marca, String subMarca, int modelo, Color color, String estado) {
            this.marca = marca;
            this.subMarca = subMarca;
            this.modelo = modelo;
            this.color = color;
            this.estado = estado;
        }

        public String getMarca() {
            return this.marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getSubMarca() {
            return this.subMarca;
        }

        public void setSubMarca(String subMarca) {
            this.subMarca = subMarca;
        }

        public int getModelo() {
            return this.modelo;
        }

        public void setModelo(int modelo) {
            this.modelo = modelo;
        }

        public Color getColor() {
            return this.color;
        }

        public void setColor(Color color) {
            this.color = color;
        }

        public String getEstado() {
            return this.estado;
        }

        public void setEstado(String estado) {
            this.estado = estado;
        }

        public String toString() {
            return "Automovil{marca='" + this.marca + "', subMarca='" + this.subMarca + "', modelo=" + this.modelo + ", color=" + this.color + ", estado='" + this.estado + "'}";
        }

        public void encender() {
            this.estado = "Encendido...";
            System.out.println("El Automovil se esta encendiendo\n Estado de tu Automovil: " + this.estado);
        }

        public void apagar() {
            this.estado = "Apagado...";
            System.out.println("El Automovil se apago\n Estado de tu Automovil: " + this.estado);
        }

        public void chocar() {
            this.estado = "Chocado... R.I.P. Automovil";
            System.out.println("El Automvil acelero en exceso en una curva\n Estado de tu Automovil: " + this.estado);
        }
    }
