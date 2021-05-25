package com.kristina.studentsrestapi.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class ExamResult {

    private long examResultId;
    private long examResult;

    public ExamResult() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
