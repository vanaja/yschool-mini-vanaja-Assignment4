/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yit.yschool.managedbean;

import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.yit.yschool.dao.marks;
import org.yit.yschool.dao.marksDAO;

/**
 *
 * @author Vanaja
 */
@ManagedBean
@SessionScoped
public class marksManagedBean {

    private marks insertedMarks;
    marksDAO marksDAO;
    
    public marksManagedBean() {
        this.insertedMarks=new marks();
        this.marksDAO = new  marksDAO();
    }

    public void insertMarks() {
        this.marksDAO.insertMarks(insertedMarks); 
        setInsertedMarks(insertedMarks);
        insertedMarks = new marks();
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, " Marks entered successfully ", null));
    }
    
    public List<marks> getMarksList() {
        return this.marksDAO.getMarksList();
    }

    public marks getInsertedMarks() {
        return insertedMarks;
    }

    public void setInsertedMarks(marks insertedMarks) {
        this.insertedMarks = insertedMarks;
    }
    
}
