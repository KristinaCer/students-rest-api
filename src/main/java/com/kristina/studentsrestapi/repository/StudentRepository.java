package com.kristina.studentsrestapi.repository;

import com.kristina.studentsrestapi.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
