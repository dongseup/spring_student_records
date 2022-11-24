package com.noone.spring_student_records.model;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Builder
@Data
public class StudentsModel {
    private int id;
    @NonNull @Builder.Default private String name = "NULL NAME";
    private String email;
}
