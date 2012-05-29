package org.yit.yschool.managedbean;

import java.util.Iterator;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.yit.yschool.dao.subject;
import org.yit.yschool.dao.subjectDAO;

/**
 *
 * @author Vanaja
 */
@ManagedBean
@SessionScoped
public class subjectManagedBean {
 
    private subject insertedSubject;
   
    private String subjectName;
    private List<subject> subject;
    subjectDAO subjectDAO;
    
   public subjectManagedBean() {
        
        this.insertedSubject = new subject();
        this.subjectDAO = new  subjectDAO();

    }

    public List<subject> getSubjectList() {
        return this.subjectDAO.getSubjectList();
    }    
    
    public void addSubject() {
        this.subjectDAO.addSubject(insertedSubject);
        setInsertedSubject(insertedSubject);
        insertedSubject = new subject();
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, " Subject Registered successfully ", null));
        
    }    
 
    public List getSubjectIdList(){        
        List subjectIdList;        
        subjectIdList=this.subjectDAO.getSubjectListIdList();        
        return subjectIdList;        
    }  

    public subject getInsertedSubject() {
        return insertedSubject;
    }

    public void setInsertedSubject(subject insertedSubject) {
        this.insertedSubject = insertedSubject;
    }

    public List<subject> getSubject() {
        return subject;
    }

    public void setSubject(List<subject> subject) {
        this.subject = subject;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectname) {
        this.subjectName = subjectname;
    }

}
