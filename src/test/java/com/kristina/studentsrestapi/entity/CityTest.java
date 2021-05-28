package com.kristina.studentsrestapi.entity;

import org.junit.jupiter.api.*;

class CityTest {
    private City city;

    @BeforeAll
    //Must be static!
    public static void beforeClass() {
        System.out.println("Before - I am only called once!");
    }

    @BeforeEach
    public void setup() {
        System.out.println("In before each..");
        city = new City("Zurich");
    }

    @DisplayName("City id getter retrieves expected city id")
    @Test
    void getCityId() {
        Long idValue = 4l;
        city.setCityId(idValue);
        System.out.println(city.toString());
    }

    @Test
    void getName() {
    }

    @Test
    void testToString() {
        System.out.println(city.toString());
    }

    @AfterAll
    public static void afterClass() {
        System.out.println("After all tests are executed");
    }
}