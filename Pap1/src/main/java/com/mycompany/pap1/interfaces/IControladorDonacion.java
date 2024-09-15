/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pap1.interfaces;


import com.mycompany.pap1.datatypes.dtDonacion;
import com.mycompany.pap1.logica.Donacion;
import com.mycompany.pap1.logica.EstadoDistribucion;
import java.time.LocalDate;

/**
 *
 * @author horacio
 */
public interface IControladorDonacion {
        public void modificarDonacion(int id, dtDonacion datosModificados);
        
        public void agregarDonacion(dtDonacion donacion);
        dtDonacion buscarDonacionPorId(int id);

    public void crearDistribucion(LocalDate fechaPreparacion, LocalDate fechaEntrega, EstadoDistribucion estadoDistribucion, String emailBeneficiario, int idDonacion);
}
