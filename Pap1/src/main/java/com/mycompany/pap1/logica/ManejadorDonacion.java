package com.mycompany.pap1.logica;

import com.mycompany.pap1.datatypes.dtDonacion;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import com.mycompany.pap1.persistencia.Conexion;

/**
 * Clase para manejar las donaciones.
 * 
 * @author horacio
 */
public class ManejadorDonacion {
    private static ManejadorDonacion instancia = null;
    
    // Lista de donaciones (aunque no parece estar siendo usada en este caso)
    private List<Donacion> donaciones = new ArrayList<>();
    
    private ManejadorDonacion() {}
    
    public static ManejadorDonacion getInstancia() {
        if (instancia == null) {
            instancia = new ManejadorDonacion();
        }
        return instancia;
    }
    
    /**
     * Método genérico para persistir cualquier entidad (Donación u otro objeto).
     * @param entidad Objeto que se desea persistir.
     */
    public void agregarEntidad(Object entidad) {
        try {
            Conexion conexion = Conexion.getInstancia();
            EntityManager em = conexion.getEntityManager();
            
            em.getTransaction().begin();
            em.persist(entidad);
            em.getTransaction().commit();
            

            System.out.println("Entidad registrada con éxito.");
        } catch (Exception e) {
            System.out.println("Error al registrar la entidad: " + e.getMessage());
        }
    }
    
    /**
     * Método para buscar una donación por su ID.
     * @param id Identificador de la donación.
     * @return La donación si se encuentra, de lo contrario null.
     */
    public Donacion buscarDonacionPorId(int id) {
        try {
            Conexion conexion = Conexion.getInstancia();
            EntityManager em = conexion.getEntityManager();
            
            Donacion donacion = em.find(Donacion.class, id);
            return donacion;
        } catch (Exception e) {
            System.out.println("Error al buscar la donación: " + e.getMessage());
            return null;
        }
    }
    
    /**
     * Método para obtener una lista de donaciones por tipo (Alimento, Articulo, etc.).
     * @param tipo Clase de la donación a buscar.
     * @return Lista de donaciones del tipo especificado.
     */
    public List<Donacion> obtenerDonacionesPorTipo(Class<? extends Donacion> tipo) {
        try {
            Conexion conexion = Conexion.getInstancia();
            EntityManager em = conexion.getEntityManager();
            
            List<Donacion> resultado = em.createQuery(
                "SELECT d FROM Donacion d WHERE TYPE(d) = :tipo", Donacion.class)
                .setParameter("tipo", tipo)
                .getResultList();
            
            return resultado;
        } catch (Exception e) {
            System.out.println("Error al obtener donaciones por tipo: " + e.getMessage());
            return new ArrayList<>();
        }
    }
}
