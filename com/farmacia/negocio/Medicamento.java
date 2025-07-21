package com.farmacia.negocio;

import java.time.LocalDate;

public class Medicamento {
    private String nombre;
    private String codigo;
    private String categoria;
    private String proveedor;
    private int stock;
    private LocalDate fechaVencimiento;
    private double precioUnidad;

    public Medicamento(String nombre, String codigo, String categoria, String proveedor,
                       int stock, LocalDate fechaVencimiento, double precioUnidad) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.categoria = categoria;
        this.proveedor = proveedor;
        this.stock = stock;
        this.fechaVencimiento = fechaVencimiento;
        this.precioUnidad = precioUnidad;
    }

    public void aumentarStock(int cantidad) {
        this.stock += cantidad;
    }

    public boolean reducirStock(int cantidad) {
        if (cantidad <= this.stock) {
            this.stock -= cantidad;
            return true;
        }
        return false;
    }

    public boolean estaPorVencer() {
        return fechaVencimiento.minusDays(30).isBefore(LocalDate.now());
    }

    // Getters y Setters omitidos por brevedad
}
