package com.nbu.ejournal.controller;

import com.nbu.ejournal.model.Teacher;
import com.nbu.ejournal.service.TeacherService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("teacher")
@AllArgsConstructor
public class TeacherController {

    private TeacherService teacherService;

    @PostMapping
    public Teacher save(Teacher.TeacherRequest teacherRequest) {
        return teacherService.save(teacherRequest);
    }
}
