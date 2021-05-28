package com.kristina.studentsrestapi.entity;

import javax.persistence.*;

@Entity
@Table(name = "exam_result")
public class ExamResult {
    @Id
    @Column(name = "exam_result_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long examResultId;
    @Column(name = "exam_result")
    private long examResult;

    public ExamResult() {
    }

    public long getExamResultId() {
        return examResultId;
    }

    public void setExamResultId(long examResultId) {
        this.examResultId = examResultId;
    }

    public long getExamResult() {
        return examResult;
    }

    public void setExamResult(long examResult) {
        this.examResult = examResult;
    }

}
