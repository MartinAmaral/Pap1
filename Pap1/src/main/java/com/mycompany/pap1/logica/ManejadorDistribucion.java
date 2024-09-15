package com.mycompany.pap1.logica;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class ManejadorDistribucion {
    
    private static ManejadorDistribucion instancia = null;
    private List<Distribucion> distribuciones = new ArrayList<>();

    // Constructor privado para patrón Singleton
    private ManejadorDistribucion() {}

    // Método estático para obtener la instancia (Singleton)
    public static ManejadorDistribucion getInstancia() {
        if (instancia == null)
            instancia = new ManejadorDistribucion();
        return instancia;
    }

    // Método para agregar una nueva distribución a la lista
    public void agregarDistribucion(Distribucion distribucion) {
        distribuciones.add(distribucion);
        System.out.println("Distribución registrada con éxito.");
    }

    // Método para buscar una distribución por email del beneficiario y el ID de la donación
    public Distribucion buscarDistribucion(String emailBeneficiario, int idDonacion) {
        for (Distribucion distribucion : distribuciones) {
            if (distribucion.getBeneficiario().getEmail().equalsIgnoreCase(emailBeneficiario) &&
                distribucion.getDonacion().getId() == idDonacion) {
                return distribucion;
            }
        }
        System.out.println("Distribución no encontrada para el beneficiario: " + emailBeneficiario + " y donación ID: " + idDonacion);
        return null;
    }

    // Método para actualizar una distribución existente
    public void actualizarDistribucion(Distribucion distribucionActualizada) {
        for (int i = 0; i < distribuciones.size(); i++) {
            Distribucion distribucion = distribuciones.get(i);
            if (distribucion.getBeneficiario().getEmail().equalsIgnoreCase(distribucionActualizada.getBeneficiario().getEmail()) &&
                distribucion.getDonacion().getId() == distribucionActualizada.getDonacion().getId()) {
                
                // Actualiza la distribución en la lista
                distribuciones.set(i, distribucionActualizada);
                System.out.println("Distribución actualizada con éxito.");
                return;
            }
        }
        System.out.println("Error: No se encontró la distribución a actualizar.");
    }

    // Método para obtener todas las distribuciones (por ejemplo, para visualización)
    public List<Distribucion> obtenerDistribuciones() {
        return distribuciones;
    }
}
