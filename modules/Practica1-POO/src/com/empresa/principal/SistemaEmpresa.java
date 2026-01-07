package com.empresa.principal;

import com.empresa.modelos.*;
import java.util.ArrayList;

public class SistemaEmpresa {
    public static void main(String[] args) {
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();

        // Agregando objetos de diferentes tipos a la misma lista
        listaEmpleados.add(new EmpleadoAsalariado("Carlos Ruiz", "EMP001", 2500.0));
        listaEmpleados.add(new EmpleadoPorHoras("Ana Beltrán", "EMP002", 45, 15.0));

        System.out.println("--- Reporte de Nómina ---");
        for (Empleado e : listaEmpleados) {
            // Aplicación de Polimorfismo en tiempo de ejecución
            System.out.println("ID: " + e.getId() + 
                               " | Nombre: " + e.getNombre() + 
                               " | Salario: $" + e.calcularSalario());
        }
    }
}
