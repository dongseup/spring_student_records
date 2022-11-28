package com.noone.spring_student_records.mapper;

import com.noone.spring_student_records.model.StudentsModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface StudentsMapper {
    List<StudentsModel> getStudents();
}
