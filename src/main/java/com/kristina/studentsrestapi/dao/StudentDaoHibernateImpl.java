package com.kristina.studentsrestapi.dao;

import com.kristina.studentsrestapi.entity.Student;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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
    @Transactional
    public List<Student> findAll() {
        //get current hibernate session
        Session currentSession = entityManager.unwrap(Session.class);
        //create a query
        List<Student> students  = currentSession.createQuery("from Student").list();
        //execute query and get result list
        return students;
    }
}
