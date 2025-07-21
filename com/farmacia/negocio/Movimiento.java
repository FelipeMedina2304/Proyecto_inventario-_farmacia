package com.farmacia.negocio;

import java.time.LocalDate;

public class Movimiento {
    public enum Tipo { ENTRADA, SALIDA }

    private Tipo tipo;
    private int cantidad;
    private LocalDate fecha;
    private Medicamento medicamento;

    public Movimiento(Tipo tipo, int cantidad, LocalDate fecha, Medicamento medicamento) {
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.medicamento = medicamento;
    }

    // Getters y Setters omitidos por brevedad
}
