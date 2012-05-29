package org.yit.yschool.dao;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Vanaja
 */
@Entity
public class marks implements Serializable {
    
    @Id  
    @Column(name = "studentId")
    private int studentId;
    
    @Id
    @Column(name = "subjectId")    
    private int subjectId;    
   
    @Column(name = "studentMarks")
    private int studentMarks;
    
    @ManyToOne
    @PrimaryKeyJoinColumn(name="STUDENTID",referencedColumnName="STUDENTID")
    private student student;
    
    @ManyToOne
    @PrimaryKeyJoinColumn(name="SUBJECTID",referencedColumnName="SUBJECTID")
    private subject subject;

    public student getStudent() {
        return student;
    }

    public void setStudent(student s) {
        this.student = s;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getStudentMarks() {
        return studentMarks;
    }

    public void setStudentMarks(int studentmarks) {
        this.studentMarks = studentmarks;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public subject getSubject() {
        return subject;
    }

    public void setSubject(subject su) {
        this.subject = su;
    }
     
    
}
