package com.kristina.studentsrestapi.service;

import com.kristina.studentsrestapi.entity.Student;
import org.springframework.stereotype.Service;
import java.util.List;

public interface StudentService {
    public List<Student> retrieveStudents();
    public Student findById(long id);
    public void save (Student student);
    public void deleteById(long id);
}
