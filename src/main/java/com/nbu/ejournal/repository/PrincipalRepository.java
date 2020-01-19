package com.nbu.ejournal.repository;

import com.nbu.ejournal.model.Principal;
import org.springframework.data.repository.CrudRepository;

public interface PrincipalRepository extends CrudRepository<Principal, String> {

    Principal findByEmail(String email);
    
    Principal findBySchoolId(int schoolId);

    Principal getBySchoolName(String schoolName);
}
