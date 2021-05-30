package com.kristina.studentsrestapi.dao;

import com.kristina.studentsrestapi.entity.Student;

import java.util.List;

public interface StudentsDao {
    List<Student> findAll();
    Student findById(long id);
    void save (Student student);
    void deleteById(long id);
    List<Student>studentsFromACity(long cityId);
    double avgCityResult(long cityId);
}
