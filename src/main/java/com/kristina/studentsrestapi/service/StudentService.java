package com.kristina.studentsrestapi.service;

import com.kristina.studentsrestapi.entity.Student;
import com.kristina.studentsrestapi.dao.StudentDaoHibernateImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    public static final Logger log = LoggerFactory.getLogger(StudentService.class);
    private StudentDaoHibernateImpl studentDaoHibernateImpl;
    @Autowired
    public void setStudentRepository(StudentDaoHibernateImpl studentDaoHibernateImpl) {
        this.studentDaoHibernateImpl = studentDaoHibernateImpl;
        log.info("Student REPO created.");
    }

    public List<Student> retrieveStudents() {
        return studentDaoHibernateImpl.findAll();
    }
}
