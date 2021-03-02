package com.masai.app.student_review.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

    @Id
    private String studentId;
    private String studentName;
    private String StudentSection;

//    Empty Constructor : Needed for some binding purposes
//    Wont need if @Entity is not there.
    public Student() {
    }

    public Student(String studentId, String studentName, String studentSection) {
        this.studentId = studentId;
        this.studentName = studentName;
        StudentSection = studentSection;
    }

// Getter and Setter are needed because we have have kept all variables of this class as private.
//    And It will accessed only by getters and setters.
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSection() {
        return StudentSection;
    }

    public void setStudentSection(String studentSection) {
        StudentSection = studentSection;
    }

//    toString is needed because if not used then, when we print objects of this class,
//    then only address of those objects will be printed.
    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", studentName='" + studentName + '\'' +
                ", StudentSection='" + StudentSection + '\'' +
                '}';
    }
}
