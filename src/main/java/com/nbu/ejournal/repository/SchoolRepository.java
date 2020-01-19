package com.nbu.ejournal.repository;

import com.nbu.ejournal.model.School;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SchoolRepository extends CrudRepository<School, Integer> {

    School findByName(String name);

    School findById(int schoolId);

    School findByPrincipalEmail(String email);

}
