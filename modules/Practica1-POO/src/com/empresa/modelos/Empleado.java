package com.empresa.modelos;

public abstract class Empleado {
    // Encapsulamiento: Atributos privados
    private String nombre;
    private String id;

    public Empleado(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    // Getters y Setters (Acceso controlado)
    public String getNombre() { return nombre; }
    public String getId() { return id; }

    // Polimorfismo: Definición del método que variará en las subclases
    public abstract double calcularSalario();
}
