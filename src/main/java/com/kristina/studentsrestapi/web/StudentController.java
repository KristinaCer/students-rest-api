package com.kristina.studentsrestapi.web;

import com.kristina.studentsrestapi.entity.Student;
import com.kristina.studentsrestapi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {
    private StudentService studentService;

    @Autowired
    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> studentList = studentService.retrieveStudents();
        //ResponseEntity represents the entire HTTP response and includes the status code, headers and the response body
        return new ResponseEntity<>(studentList, HttpStatus.OK);
    }

    @GetMapping("/students/{studentId}")
    public ResponseEntity<Student> getStudent(@PathVariable long studentId) {
        var student = studentService.findById(studentId);
        if (student == null) {
            throw new RuntimeException();
        }
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @PostMapping("/students")
    public ResponseEntity<Student> addStudent(@RequestBody Student student) {
        studentService.save(student);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @GetMapping("/students/city/{cityId}")
    public ResponseEntity<List<Student>> getStudentsFromCity(@PathVariable long cityId) {
        List<Student> studentList = studentService.studentsFromCity(cityId);
        return new ResponseEntity<>(studentList, HttpStatus.OK);
    }
}
