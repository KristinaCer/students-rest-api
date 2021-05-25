package com.kristina.studentsrestapi.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Course {
    private long courseId;
    private String name;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "exam_result_id")
    private List<ExamResult> examResults;

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
