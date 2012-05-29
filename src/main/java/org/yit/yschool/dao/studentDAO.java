package org.yit.yschool.dao;

import java.util.List;
import javax.persistence.*;
/**
 *
 * @author Vanaja
 */
public class studentDAO {
    
    EntityManagerFactory emf;
    EntityManager em;
    
    public studentDAO() {
        this.emf = Persistence.createEntityManagerFactory("yschool-mini-vanaja-PU");
        this.em = emf.createEntityManager();
    }
    
    public boolean addStudent(final student s) {
        if (s == null) {
            return false;
        }
        em.getTransaction().begin();
        em.persist(s);
        em.getTransaction().commit();
        return true;
    }
    
    public List<student> getStudentList() {
        Query query = em.createQuery("select s from student s");
        return query.getResultList();
    }
    
    public List getStudentIdList() {
        Query query = em.createQuery("select s.studentId from student s");
        return query.getResultList();
    }
}
