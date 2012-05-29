package org.yit.yschool.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Vanaja
 */
public class marksDAO {
    
    EntityManagerFactory emf;
    EntityManager em;

    public marksDAO() {
        this.emf = Persistence.createEntityManagerFactory("yschool-mini-vanaja-PU");
        this.em = emf.createEntityManager();
    }
    public boolean insertMarks(final marks result) {
        if (result == null) {
            return false;
        }
        em.getTransaction().begin();
        em.persist(result);
        em.getTransaction().commit();
        return true;
    }
    
    public List<marks> getMarksList() {
        Query query = em.createQuery("select m from marks m");
        return query.getResultList();
    }
}
