package com.nbu.ejournal.controller;

import com.nbu.ejournal.model.School;
import com.nbu.ejournal.service.SchoolService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("school")
@AllArgsConstructor
public class SchoolController {

    private SchoolService schoolService;

    @GetMapping
    public School get(@RequestParam String name) {
        return schoolService.getByName(name);
    }

    @RequestMapping("/all")
    public List<School> getAll() {
        return schoolService.getAll();
    }

    @PostMapping
    public School save(@RequestBody School.SchoolRequest schoolRequest) {
        return schoolService.save(schoolRequest);
    }

}
