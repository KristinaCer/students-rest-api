package com.kristina.studentsrestapi.service;

import com.kristina.studentsrestapi.entity.Student;
import com.kristina.studentsrestapi.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService {

    private StudentRepository studentRepository;
    @Autowired
    public void setStudentRepository(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> retrieveStudents() {
        return (List<Student>) studentRepository.findAll();
    }
}
