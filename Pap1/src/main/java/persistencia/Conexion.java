package persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexion  {
    
    private static Conexion instancia = null;
    private static EntityManagerFactory emf;

    private Conexion(){}

    public static Conexion getInstancia() {
        if (instancia == null) {
            instancia = new Conexion();
            emf = Persistence.createEntityManagerFactory("pap1hibernate");
        }
        return instancia;
    }

    // Este método crea un nuevo EntityManager cada vez que se llama
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void close() {
        if (emf != null && emf.isOpen()) {
            emf.close();
        }
    }
}
