package com.noone.spring_student_records.service;

import com.noone.spring_student_records.mapper.StudentsMapper;
import com.noone.spring_student_records.model.StudentsModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentsService {
    @Autowired
    public StudentsMapper mapper;

    public List<StudentsModel> getStudents(){
        return mapper.getStudents();
    }
}
