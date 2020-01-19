package com.nbu.ejournal.repository;

import com.nbu.ejournal.model.Grade;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GradeRepository extends CrudRepository<Grade, Integer> {

    List<Grade> findByStudentEmail(String studentEmail);

}
