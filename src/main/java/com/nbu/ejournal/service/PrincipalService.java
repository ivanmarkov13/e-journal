package com.nbu.ejournal.service;

import com.nbu.ejournal.model.Principal;
import com.nbu.ejournal.model.School;
import com.nbu.ejournal.repository.PrincipalRepository;
import com.nbu.ejournal.repository.SchoolRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PrincipalService {

    private PrincipalRepository principalRepository;
    private SchoolRepository schoolRepository;

    public Principal getByEmail(String email) {
        return principalRepository.findByEmail(email);
    }

    public Principal getBySchoolName(String schoolName) {
        return principalRepository.getBySchoolName(schoolName);
    }

    public Principal save(Principal principal) {
        return principalRepository.save(principal);
    }
}
