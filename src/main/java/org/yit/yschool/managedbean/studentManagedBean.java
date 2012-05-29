package org.yit.yschool.managedbean;

import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.yit.yschool.dao.student;
import org.yit.yschool.dao.studentDAO;

/**
 *
 * @author Vanaja
 */
@ManagedBean
@SessionScoped
public class studentManagedBean implements Serializable{

    private student insertedStudent;
    studentDAO studentDAO;
    
    List<student> studentlist;
    
    public studentManagedBean() { 
        this.insertedStudent = new student();
        this.studentDAO = new studentDAO();
    }
    
    public void addStudent() {
        this.studentDAO.addStudent(insertedStudent);
        setInsertedStudent(insertedStudent);
        insertedStudent = new student();
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, " Student Registered successfully ", null));
    } 
    
    public List<student> getStudentList() {
        return this.studentDAO.getStudentList();
    }

    public List getStudentIdList()
    {
        return this.studentDAO.getStudentIdList();
    }
    public student getInsertedStudent() {
        return insertedStudent;
    }

    public void setInsertedStudent(student insertedStudent) {
        this.insertedStudent = insertedStudent;
    }
}
