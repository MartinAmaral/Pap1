/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



/**
 *
 * @author gonza
 */
public class Conexion  {
    
private static Conexion instancia = null;
private static EntityManagerFactory emf;
private static EntityManager em;

private Conexion(){}

public static Conexion getInstancia() {
		if (instancia == null) {
			instancia = new Conexion();
			emf = Persistence.createEntityManagerFactory("pap1hibernate");
			em=emf.createEntityManager();
		}
		return instancia;
                
}

public EntityManager getEntityManager() {
		return this.em;
	}

public void close() {
		this.em.close();
		this.emf.close();
	}
}
