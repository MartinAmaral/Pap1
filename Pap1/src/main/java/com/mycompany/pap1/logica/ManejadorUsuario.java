
package com.mycompany.pap1.logica;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import persistencia.Conexion;

/**
 *
 * @author horacio
 */
public class ManejadorUsuario {
    private static ManejadorUsuario instancia = null;
    public List<Usuario> usuarios = new ArrayList<>();
    
    private ManejadorUsuario(){}
    
    public static ManejadorUsuario getInstancia(){
            if (instancia == null)
                instancia = new ManejadorUsuario();
            return instancia;
    }
    
     
   public void agregarRepartidor(Repartidor user) {
         
    try {
        Conexion conexion = Conexion.getInstancia();
        EntityManager em = conexion.getEntityManager();
        
        em.getTransaction().begin();
        
        em.persist(user);
        
        em.getTransaction().commit();
        
        System.out.println("User registrada con éxito.");
    } catch (Exception e) {
        System.out.println("Error al registrar el usuario: " + e.getMessage());
    }
}   
     
     
    
}
