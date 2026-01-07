package com.empresa.modelos;

public class EmpleadoAsalariado extends Empleado {
    private double salarioMensual;

    public EmpleadoAsalariado(String nombre, String id, double salario) {
        super(nombre, id); // Uso de herencia
        this.salarioMensual = salario;
    }

    @Override
    public double calcularSalario() {
        return salarioMensual;
    }
}
