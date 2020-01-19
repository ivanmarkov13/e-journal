package com.nbu.ejournal.controller;

import com.nbu.ejournal.model.Student;
import com.nbu.ejournal.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("student")
@AllArgsConstructor
public class StudentConrtoller {

    private StudentService studentService;

    @GetMapping("/all")
    public List<Student> getAll() {
        return studentService.getAll();
    }

    @GetMapping()
    public Student getByEmail(@RequestParam String email) {
        return studentService.getByEmail(email);
    }

    @PostMapping
    public Student save(@RequestBody Student.StudentRequest studentRequest) {
        return studentService.save(studentRequest);
    }

    @PutMapping
    public Student update(@RequestBody Student.StudentRequest studentRequest) {
        return studentService.save(studentRequest);
    }

}
