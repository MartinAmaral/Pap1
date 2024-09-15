package com.mycompany.pap1.logica;
import com.mycompany.pap1.datatypes.dtDistribucion;
import com.mycompany.pap1.datatypes.dtArticulo;
import com.mycompany.pap1.datatypes.dtDonacion;
import com.mycompany.pap1.interfaces.IControladorDistribucion;
import com.mycompany.pap1.logica.Distribucion;
import com.mycompany.pap1.logica.Beneficiario;
import com.mycompany.pap1.logica.Donacion;
import com.mycompany.pap1.logica.ManejadorDistribucion;
import java.time.LocalDate;
public class ControladorDistribucion implements IControladorDistribucion{

    
    private static ControladorDistribucion instancia = null;
    public static ControladorDistribucion getInstancia(){
            if (instancia == null)
                instancia = new ControladorDistribucion();
            return instancia;
    }
    
    
public void crearDistribucion(LocalDate fechaPreparacion, LocalDate fechaEntrega, EstadoDistribucion estadoDistribucion, Beneficiario beneficiario, Donacion donacion) {
        Distribucion nuevaDistribucion = new Distribucion(fechaPreparacion, fechaEntrega, estadoDistribucion, beneficiario, donacion);
        ManejadorDistribucion mD = ManejadorDistribucion.getInstancia();
        mD.agregarDistribucion(nuevaDistribucion);
        System.out.println("Distribucion registrada con exito.");
    }

    @Override
    public Distribucion buscarDistribucion(int idDonacion, String emailBeneficiario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}