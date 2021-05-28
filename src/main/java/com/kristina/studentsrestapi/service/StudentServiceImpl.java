package com.kristina.studentsrestapi.service;

import com.kristina.studentsrestapi.dao.StudentDaoHibernateImpl;
import com.kristina.studentsrestapi.entity.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
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

    @Override
    @Transactional
    public Student findById(long id) {
        return studentDaoHibernateImpl.findById(id);
    }

    @Override
    @Transactional
    public void save(Student student) {
        studentDaoHibernateImpl.save(student);
    }

    @Override
    @Transactional
    public void deleteById(long id) {
        studentDaoHibernateImpl.deleteById(id);
    }

    @Override
    public List<Student> studentsFromACity(long cityId) {
        return studentDaoHibernateImpl.studentsFromACity(cityId);
    }

    @Override
    public double avgCityResult(long cityId) {
        return 0;
    }
}
