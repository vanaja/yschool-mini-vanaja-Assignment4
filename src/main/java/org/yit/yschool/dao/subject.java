package org.yit.yschool.dao;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.*;

/**
 *
 * @author Vanaja
 */
@Entity
public class subject implements Serializable {
    
    @Id
    @GeneratedValue
    @Column(name = "subjectId")
    private int subjectId;    
    
    @Column(name = "subjectName")
    private String subjectName;
    
    @OneToMany
    private Collection<marks> students;

    public subject(int subjectId, String subjectName) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
    }

    public subject() {
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectname) {
        this.subjectName = subjectname;
    }
    
    public Collection<marks> getStudents() {
        return students;
    }

    public void setStudents(Collection<marks> students) {
        this.students = students;
    }
}
