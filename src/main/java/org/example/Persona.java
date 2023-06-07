package org.example;

public class Persona {
    private int edad;
    private String nombre;
    private double estatura;
    private double peso;
    private String genero;

    public Persona() {
        this.edad = 0;
        this.nombre = "";
        this.estatura = 0.0;
        this.peso = 0.0;
        this.genero = "";
    }

    public Persona(int edad, String nombre, double estatura, double peso, String genero) {
        this.edad = edad;
        this.nombre = nombre;
        this.estatura = estatura;
        this.peso = peso;
        this.genero = genero;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getEstatura() {
        return this.estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String toString() {
        return "Persona{edad=" + this.edad + ", nombre='" + this.nombre + "', estatura=" + this.estatura + ", peso=" + this.peso + ", genero='" + this.genero + "'}";
    }

    public void cambioGenero() {
        if (this.genero.equals("masculino")) {
            this.genero = "femenino";
        } else if (this.genero.equals("femenino")) {
            this.genero = "masculino";
        }

        System.out.println(this.nombre + " Se cambio el genero\n Ahors es: " + this.genero);
    }

    public void comer() {
        this.peso += 10.0;
        System.out.println(this.nombre + "  Se comio la mounstrosa y subio 10kg\n Ahora su peso es: " + this.peso + "kg");
    }

    public void Amputacion() {
        this.estatura -= 0.4;
        System.out.println(this.nombre + "  Le amputaron las dos piernas tras chocar el Automovil\n Ahora su estatura es: " + this.estatura + "m");
    }
}
