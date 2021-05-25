package com.kristina.studentsrestapi.dao;

import com.kristina.studentsrestapi.entity.Student;

import java.util.List;

public interface StudentsDao {
    public List<Student> findAll();
}
