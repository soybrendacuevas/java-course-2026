package com.empresa.modelos;

public class EmpleadoPorHoras extends Empleado {
    private int horasTrabajadas;
    private double pagoPorHora;

    public EmpleadoPorHoras(String nombre, String id, int horas, double pago) {
        super(nombre, id);
        this.horasTrabajadas = horas;
        this.pagoPorHora = pago;
    }

    @Override
    public double calcularSalario() {
        return horasTrabajadas * pagoPorHora;
    }
}
