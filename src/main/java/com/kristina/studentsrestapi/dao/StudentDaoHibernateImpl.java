package com.kristina.studentsrestapi.dao;

import com.kristina.studentsrestapi.entity.Student;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;


@Repository
public class StudentDaoHibernateImpl implements StudentsDao {
    private EntityManager entityManager;

    @Autowired
    public StudentDaoHibernateImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    @Override
    public List<Student> findAll() {
        //get current hibernate session
        Session currentSession = entityManager.unwrap(Session.class);
        //create a query
        List<Student> students  = currentSession.createQuery("from Student").list();
        //execute query and get result list
        return students;
    }

    @Override
    public Student findById(long id) {
        Session currentSession = entityManager.unwrap(Session.class);
        Student student = currentSession.get(Student.class, id);
        return student;
    }

    @Override
    public void save(Student student) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(student);
    }

    @Override
    public void deleteById(long id) {
        Session currentSession = entityManager.unwrap(Session.class);
        Query query = currentSession.createQuery("delete from Student where id = :studentId");
        query.setParameter("studentId", id);
        query.executeUpdate();
    }
}
