package com.masai.app.student_review.service;


import com.masai.app.student_review.entity.Student;
import com.masai.app.student_review.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAllStudents(){

        List<Student> studentInfo = studentRepository.findAll();
        return studentInfo;
    }

    public Student addStudent(Student student) {
        Student student1 = studentRepository.save(student);
        return student1;

    }

    public String updateStudent(Student student) {

        Optional<Student> student1 = studentRepository.findById(student.getStudentId());

        if (student1.isEmpty()){
            return "Repository Error";
        }

        student1.get().setStudentName(student.getStudentName());
        student1.get().setStudentSection(student.getStudentSection());

        studentRepository.save(student1.get());

        return "Info Updated";

    }

    public String deleteStudent(String studentId) {

        Optional<Student> st = studentRepository.findById(studentId);

        if (st.isEmpty()){
            return "Delete Failed";
        }

        studentRepository.delete(st.get());
        return "Successfully Deleted";

//        if {
//            studentRepository.delete(st);
//            return "Successfully Deleted";
//        }
//
//        catch (Exception ex){
//            return "Delete Failed";
//        }

    }
}
