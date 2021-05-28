package com.kristina.studentsrestapi.web;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

@Disabled("Disabled until learn how to test spring boot.")
class StudentControllerTest {

    @Test
    void setStudentService() {

    }

    @Test
    void getAllStudents() {
    }

    @Test
    void getStudent() {
    }

    @Test
    void addStudent() {
    }

    @EnabledOnOs(OS.MAC)
    @Test
    void testMeOnMac(){
    }

    @EnabledOnOs(OS.WINDOWS)
    @Test
    void testMeOnWindows(){
    }

    @EnabledOnJre(JRE.JAVA_17)
    @Test
    void testMeOnJava11(){
    }
}