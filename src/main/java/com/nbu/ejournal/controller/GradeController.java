package com.nbu.ejournal.controller;

import com.nbu.ejournal.model.Grade;
import com.nbu.ejournal.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("grade")
public class GradeController {

    @Autowired
    private GradeService gradeService;

    @PostMapping
    public Grade save(@RequestBody Grade.GradeRequest gradeRequest) {
        return gradeService.save(gradeRequest);
    }

    @GetMapping
    public List<Grade> findByEmail(@RequestParam String studentEmail) {
        return gradeService.findByEmail(studentEmail);
    }

}
