package com.noone.spring_student_records.model;

import lombok.Data;
import lombok.NonNull;

@Data
public class StudentsModel {
    @NonNull private int student_id;
    private String student_num;
    private String student_name;
    private String tel;
    private int ban_id;
}
