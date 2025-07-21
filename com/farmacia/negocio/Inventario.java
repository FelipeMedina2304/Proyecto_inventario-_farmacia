package com.farmacia.negocio;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Medicamento> medicamentos;

    public Inventario() {
        this.medicamentos = new ArrayList<>();
    }

    public void agregarMedicamento(Medicamento med) {
        medicamentos.add(med);
    }

    public Medicamento buscarPorNombre(String nombre) {
        for (Medicamento m : medicamentos) {
            if (m.getNombre().equalsIgnoreCase(nombre)) {
                return m;
            }
        }
        return null;
    }

    public List<Medicamento> reportarVencimientos() {
        List<Medicamento> proximosAVencer = new ArrayList<>();
        for (Medicamento m : medicamentos) {
            if (m.estaPorVencer()) {
                proximosAVencer.add(m);
            }
        }
        return proximosAVencer;
    }

    // Otros métodos omitidos por brevedad
}
