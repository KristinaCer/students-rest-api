package com.kristina.studentsrestapi.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student student;

    @BeforeEach
    void setUp() {
        student = new Student("Joe", "Anderson", "j.anderson@gmail.com");
    }

    @Test
    public void groupedStudentAssertions() {
        assertAll("Test properties",
                () -> assertEquals("Joe", student.getFirstName(), "First name failed."),
                () -> assertEquals("Anderson", student.getLastName(), "Second name failed."),
                () -> assertEquals("j.anderson@gmail.com", student.getEmail(), "Email failed.")
        );
    }

    @Test
    void testToString() {
        System.out.println(student.toString());
    }
}