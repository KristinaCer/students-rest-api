package com.kristina.studentsrestapi.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "course")
public class Course {
    @javax.persistence.Id
    @Column(name = "course_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long courseId;
    @Column(name = "name")
    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "exam_result_id")
    private List<ExamResult> examResults;

    public Course() {
    }

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
