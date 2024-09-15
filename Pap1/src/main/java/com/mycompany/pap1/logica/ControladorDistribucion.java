package com.mycompany.pap1.logica;

import com.mycompany.pap1.datatypes.dtDistribucion;
import com.mycompany.pap1.datatypes.dtArticulo;
import com.mycompany.pap1.datatypes.dtDonacion;
import com.mycompany.pap1.interfaces.IControladorDistribucion;
import com.mycompany.pap1.logica.Distribucion;
import com.mycompany.pap1.logica.Beneficiario;
import com.mycompany.pap1.logica.Donacion;
import com.mycompany.pap1.logica.ManejadorDistribucion;
import com.mycompany.pap1.logica.ManejadorDonacion;
import com.mycompany.pap1.logica.ManejadorUsuario;
import java.time.LocalDate;

public class ControladorDistribucion implements IControladorDistribucion {

    private static ControladorDistribucion instancia = null;
    
    public static ControladorDistribucion getInstancia() {
        if (instancia == null) {
            instancia = new ControladorDistribucion();
        }
        return instancia;
    }

    public void crearDistribucion(LocalDate fechaPreparacion, LocalDate fechaEntrega, EstadoDistribucion estadoDistribucion, String emailBeneficiario, int idDonacion) {
        ManejadorUsuario mU = ManejadorUsuario.getInstancia();
        ManejadorDonacion mD = ManejadorDonacion.getInstancia();
        
        // Buscar beneficiario y donación por sus identificadores
        Beneficiario beneficiario = mU.buscarBeneficiarioPorEmail(emailBeneficiario);
        Donacion donacion = mD.buscarDonacionPorId(idDonacion);
        
        if (beneficiario == null || donacion == null) {
            throw new IllegalArgumentException("Beneficiario o Donación no encontrados.");
        }

        Distribucion nuevaDistribucion = new Distribucion(fechaPreparacion, fechaEntrega, estadoDistribucion, beneficiario, donacion);
        ManejadorDistribucion mDistro = ManejadorDistribucion.getInstancia();
        mDistro.agregarDistribucion(nuevaDistribucion);
        System.out.println("Distribución registrada con éxito.");
    }

    public void editarDistribucion(String emailBeneficiario, int idDonacion, LocalDate nuevaFechaEntrega, EstadoDistribucion nuevoEstado) {
        ManejadorDistribucion mDistro = ManejadorDistribucion.getInstancia();
        ManejadorUsuario mU = ManejadorUsuario.getInstancia();
        ManejadorDonacion mD = ManejadorDonacion.getInstancia();
        
        try {
            Distribucion distribucion = mDistro.buscarDistribucion(emailBeneficiario, idDonacion);
            if (distribucion == null) {
                System.out.println("Error: Distribución no encontrada.");
                return;
            }
            
            distribucion.setFechaEntrega(nuevaFechaEntrega);
            distribucion.setEstadoDistribucion(nuevoEstado);
            
            mDistro.actualizarDistribucion(distribucion);
            System.out.println("Distribución actualizada con éxito.");
            
        } catch (Exception e) {
            System.out.println("Error al actualizar la distribución: " + e.getMessage());
        }
    }

    public Distribucion buscarDistribucion(int idDonacion, String emailBeneficiario) {
        ManejadorDistribucion mDistro = ManejadorDistribucion.getInstancia();
        return mDistro.buscarDistribucion(emailBeneficiario, idDonacion);
    }
}
