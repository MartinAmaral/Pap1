package com.mycompany.pap1.logica;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import persistencia.Conexion;

/**
 *
 * @author horacio
 */
public class ManejadorDistribucion {
    private static ManejadorDistribucion instancia = null;
    private List<Distribucion> distribuciones = new ArrayList<>();

    private ManejadorDistribucion() {}

    public static ManejadorDistribucion getInstancia() {
        if (instancia == null)
            instancia = new ManejadorDistribucion();
        return instancia;
    }

    public void agregarDistribucion(Distribucion distribucion) {
    try {
        Conexion conexion = Conexion.getInstancia();
        EntityManager em = conexion.getEntityManager();
        
        em.getTransaction().begin();
        
        em.persist(distribucion);
        
        em.getTransaction().commit();
        
        System.out.println("Distribución registrada con éxito.");
    } catch (Exception e) {
        System.out.println("Error al registrar la distribución: " + e.getMessage());
    }
}

    public Distribucion buscarDistribucion(int idDonacion, String emailBeneficiario) {
        Conexion conexion = Conexion.getInstancia();
        EntityManager em = conexion.getEntityManager();
        
        TypedQuery<Distribucion> query = em.createQuery("SELECT d FROM Distribucion d WHERE d.donacion.id = :idDonacion AND d.emailBeneficiario = :emailBeneficiario", Distribucion.class);
        query.setParameter("idDonacion", idDonacion);
        query.setParameter("emailBeneficiario", emailBeneficiario);
        
        List<Distribucion> distribuciones = query.getResultList();
        if (distribuciones.isEmpty()) {
            throw new NoSuchElementException("No se encontró la distribución");
        } else {
            return distribuciones.get(0);
        }
    }

    void agregarBeneficiario(Beneficiario user) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}