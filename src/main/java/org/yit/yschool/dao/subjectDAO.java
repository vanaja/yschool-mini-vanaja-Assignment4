package org.yit.yschool.dao;

import java.util.List;
import javax.persistence.*;

/**
 *
 * @author Vanaja
 */
public class subjectDAO {
    
    EntityManagerFactory emf;
    EntityManager em;

    public subjectDAO() {
        this.emf = Persistence.createEntityManagerFactory("yschool-mini-vanaja-PU");
        this.em = emf.createEntityManager();
    }
    
    public List<subject> getSubjectList() {
        Query query = em.createQuery("select s from subject s");
        return query.getResultList();
    }

    public boolean addSubject(final subject subject) {
        if (subject == null) {
            return false;
        }
        em.getTransaction().begin();
        em.persist(subject);
        em.getTransaction().commit();
        return true;
    }
    
    public List<subject> searchSubject(String subjectName){
        List<subject> s;       
        Query query = em.createQuery("select s from subject s where subjectName='"+subjectName+"'");
        s=query.getResultList();      
        return s;            
            
    }
    
    public List getSubjectListIdList() {
        Query query = em.createQuery("select s.subjectId from subject s");
        return query.getResultList();
    }
}
