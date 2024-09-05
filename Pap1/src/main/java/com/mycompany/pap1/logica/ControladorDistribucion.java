
package com.mycompany.pap1.logica;
import com.mycompany.pap1.datatypes.dtDistribucion;
import com.mycompany.pap1.datatypes.dtArticulo;
import com.mycompany.pap1.datatypes.dtDonacion;
import com.mycompany.pap1.interfaces.IControladorDistribucion;
import com.mycompany.pap1.logica.Distribucion;
import com.mycompany.pap1.logica.Beneficiario;
import com.mycompany.pap1.logica.Donacion;
import com.mycompany.pap1.logica.ManejadorDistribucion;
public class ControladorDistribucion implements IControladorDistribucion{
    
    public ControladorDistribucion(){
        super();
    }
    
public void agregarDistribucion(dtDistribucion distribucion) {
    
    
    Distribucion nuevaDistribucion = null;

    if (distribucion instanceof dtDistribucion) {
        nuevaDistribucion = new Distribucion(
            distribucion.getFechaPreparacion(),
            distribucion.getFechaEntrega(),
            distribucion.getEstadoDistribucion(), 
            distribucion.getBeneficiario(),
            distribucion.getDonacion()
        );
    } else {
        System.out.println("Error: no se registro la distribucion.");
        return; // Salir del método si el tipo no es reconocido
    }

    // Agregar la nueva distribución al manejador
    ManejadorDistribucion mD = ManejadorDistribucion.getInstancia();
    mD.agregarDistribucion(nuevaDistribucion);
    System.out.println("Distribucion registrada con exito.");
}
}