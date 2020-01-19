package com.nbu.ejournal.controller;

import com.nbu.ejournal.model.Course;
import com.nbu.ejournal.service.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("course")
@AllArgsConstructor
public class CourseController {

    private CourseService courseService;

    @GetMapping("/all")
    public List<Course> getAll() {
        return courseService.getAll();
    }

    @GetMapping
    public Course findByName(@RequestParam String name) {
        return courseService.findByName(name);
    }

    @GetMapping("/for-student")
    public List<Course> findForStudent(@RequestParam String studentEmail) {
        return courseService.findForStudent(studentEmail);
    }

    @PostMapping
    public Course save(@RequestBody Course.CourseRequest courseRequest) {
        return courseService.save(courseRequest);
    }
}
