package com.noone.spring_student_records.controller;

import com.noone.spring_student_records.model.StudentsModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;


@Controller
public class HomeController {
    @RequestMapping(value = "/home", method=RequestMethod.GET)
    public ModelAndView goHome(HttpServletRequest request) {
        ModelAndView mav = new ModelAndView();
        List<StudentsModel> studentsList = new ArrayList<StudentsModel>();

        // Model
        StudentsModel studentsModel;

        // 첫번째 데이터
        studentsModel = StudentsModel.builder().id(1).name("AAA").email("AAA@example.com").build();
        studentsList.add(studentsModel);

        // 두번째 데이터
        studentsModel = StudentsModel.builder().id(2).name("BBB").email("BBB@example.com").build();
        studentsList.add(studentsModel);

        // 세번째 데이터
        studentsModel = StudentsModel.builder().id(1).name("CCC").email("CCC@example.com").build();
        studentsList.add(studentsModel);

        mav.addObject("studentsList",studentsList);
        mav.setViewName("content/home");

        return mav;
    }
}