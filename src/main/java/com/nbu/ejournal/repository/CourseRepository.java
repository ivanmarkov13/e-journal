package com.nbu.ejournal.repository;

import com.nbu.ejournal.model.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Integer> {

    Course findByName(String name);

}
