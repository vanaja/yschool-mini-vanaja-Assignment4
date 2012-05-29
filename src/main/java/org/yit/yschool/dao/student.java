package org.yit.yschool.dao;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.*;

/**
 *
 * @author Vanaja
 */
@Entity
public class student implements Serializable {
    
    @Id
    @GeneratedValue
    @Column(name = "studentId")
    private int studentId;        
    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;
    @Column(name = "grade")
    private int grade;
    @Column(name = "gender")
    private String gender;

    @OneToMany
    private Collection<marks> subjects;
    
    public student() {
    }

    public student(String name, String address, int grade, String gender) {
        this.name = name;
        this.grade = grade;
        this.address = address;
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    
    public Collection<marks> getSubjects() {
        return subjects;
    }

    public void setSubjects(Collection<marks> subjects) {
        this.subjects = subjects;
    }
}
