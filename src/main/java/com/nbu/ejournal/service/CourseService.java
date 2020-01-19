package com.nbu.ejournal.service;

import com.nbu.ejournal.model.Course;
import com.nbu.ejournal.model.Student;
import com.nbu.ejournal.repository.CourseRepository;
import com.nbu.ejournal.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class CourseService {

    private CourseRepository courseRepository;
    private StudentRepository studentRepository;

    public List<Course> getAll() {
        List<Course> courses = new ArrayList<>();
        courseRepository.findAll().forEach(courses::add);
        return courses;
    }

    public Course findByName(String name) {
        return courseRepository.findByName(name);
    }

    public List<Course> findForStudent(String studentEmail) {
        Student student = studentRepository.findByEmail(studentEmail);
        List<Course> courses = student != null ? student.getCourses() : null;
        return courses;
    }

    public Course save(Course.CourseRequest courseRequest) {
        Course course = new Course();
        course.setName(courseRequest.getName());
        return courseRepository.save(course);
    }

}
