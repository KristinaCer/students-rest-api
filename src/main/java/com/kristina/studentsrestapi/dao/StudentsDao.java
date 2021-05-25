package com.kristina.studentsrestapi.dao;

import com.kristina.studentsrestapi.entity.Student;

import java.util.List;

public interface StudentsDao {
    public List<Student> findAll();
    public Student findById(long id);
    public void save (Student student);
    public void deleteById(long id);
}
