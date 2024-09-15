package com.mycompany.pap1.interfaces;

import com.mycompany.pap1.datatypes.dtDistribucion;
import com.mycompany.pap1.logica.Beneficiario;
import com.mycompany.pap1.logica.Distribucion;
import com.mycompany.pap1.logica.Donacion;
import com.mycompany.pap1.logica.EstadoDistribucion;
import java.time.LocalDate;

public interface IControladorDistribucion {
    public void crearDistribucion(LocalDate fechaPreparacion, LocalDate fechaEntrega, EstadoDistribucion estadoDistribucion, Beneficiario beneficiario, Donacion donacion);
    Distribucion buscarDistribucion(int idDonacion, String emailBeneficiario);
    
}