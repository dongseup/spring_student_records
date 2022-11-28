package com.noone.spring_student_records.controller;

import com.noone.spring_student_records.model.StudentsModel;
import com.noone.spring_student_records.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;


@Controller
public class HomeController {
    @Autowired
    StudentsService studentsService;

    @RequestMapping(value = "/home", method=RequestMethod.GET)
    public ModelAndView goHome(HttpServletRequest request) {
        ModelAndView mav = new ModelAndView();
        List<StudentsModel> studentsList = studentsService.getStudents();

        mav.addObject("studentsList",studentsList);
        mav.setViewName("content/home");

        return mav;
    }
}