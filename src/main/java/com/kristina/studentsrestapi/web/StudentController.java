package com.kristina.studentsrestapi.web;

import com.kristina.studentsrestapi.entity.Student;
import com.kristina.studentsrestapi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    private StudentService studentService;

    @Autowired
    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/student")
    public ResponseEntity<List<Student>> getAllStudents(){
        List<Student> studentList = studentService.retrieveStudents();
        //ResponseEntity represents the entire HTTP response and includes the status code, headers and the response body
        return new ResponseEntity<>(studentList, HttpStatus.OK);
    }
}
