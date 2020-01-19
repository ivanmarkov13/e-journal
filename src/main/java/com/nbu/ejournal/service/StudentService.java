package com.nbu.ejournal.service;

import com.nbu.ejournal.model.Course;
import com.nbu.ejournal.model.School;
import com.nbu.ejournal.model.Student;
import com.nbu.ejournal.repository.CourseRepository;
import com.nbu.ejournal.repository.SchoolRepository;
import com.nbu.ejournal.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class StudentService {

    private StudentRepository studentRepository;
    private SchoolRepository schoolRepository;
    private CourseRepository courseRepository;


    public List<Student> getAll() {

        List<Student> students = new ArrayList<>();
        studentRepository.findAll().forEach(students::add);

        return students;
    }


    public Student getByEmail(String email) {
        return studentRepository.findByEmail(email);
    }

    public Student save(Student.StudentRequest studentRequest) {

        Student student = new Student();

        School school = schoolRepository.findById(studentRequest.getSchoolId());
        student.setEmail(studentRequest.getEmail());
        student.setSchool(school);
        List<Course> courses = new ArrayList<>();
        studentRequest.getCourseRequests().stream()
                .map(Course.CourseRequest::getName)
                .map(courseRepository::findByName)
                .forEach(courses::add);
        student.setCourses(courses);

        return studentRepository.save(student);
    }

}
