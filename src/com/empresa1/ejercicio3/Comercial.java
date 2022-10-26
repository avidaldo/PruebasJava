package com.empresa1.ejercicio3;

public class Comercial {
    private String nombre;
    private int edad;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        if (edad<0) {
            System.err.println("ERROR");
        } else {
            this.edad = edad;
        }
    }

    @Override
    public String toString() {
        return "com.empresa1.ejercicio2.Comercial {" +
                "nombre='" + nombre + '\'' +
                ", edad='" + edad + '\'' +
                '}';
    }
}
