package com.nbu.ejournal.service;

import com.nbu.ejournal.model.Course;
import com.nbu.ejournal.model.School;
import com.nbu.ejournal.model.Teacher;
import com.nbu.ejournal.repository.CourseRepository;
import com.nbu.ejournal.repository.SchoolRepository;
import com.nbu.ejournal.repository.TeacherRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class TeacherService {

    private TeacherRepository teacherRepository;
    private CourseRepository courseRepository;
    private SchoolRepository schoolRepository;


    public Teacher save(Teacher.TeacherRequest teacherRequest) {

        Teacher teacher = new Teacher();

        List<String> coursesNames = teacherRequest.getCoursesNames();
        List<Course> courses = new ArrayList<>();
        for (String courseName : coursesNames) {
            Course course = courseRepository.findByName(courseName);
            if (course == null) {
                throw new IllegalArgumentException("Course name is not valid! A teacher can not teach non-existing course!");
            }
            courses.add(course);
        }
        School school = schoolRepository.findById(teacherRequest.getSchoolId());
        if (school == null) {
            throw new IllegalArgumentException("School id is not valid! A teacher can not teach in a non-existing school!");
        }

        teacher.setCourses(courses);
        teacher.setEmail(teacherRequest.getEmail());
        teacher.setSchool(school);

        return teacherRepository.save(teacher);
    }
}
