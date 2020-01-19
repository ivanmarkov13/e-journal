package com.nbu.ejournal.repository;

import com.nbu.ejournal.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, String> {

    Student findByEmail(String email);

}
