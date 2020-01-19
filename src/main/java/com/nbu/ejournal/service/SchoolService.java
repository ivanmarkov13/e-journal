package com.nbu.ejournal.service;

import com.nbu.ejournal.model.School;
import com.nbu.ejournal.repository.PrincipalRepository;
import com.nbu.ejournal.repository.SchoolRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class SchoolService {

    private SchoolRepository schoolRepository;
    private PrincipalRepository principalRepository;

    public School getByName(String name) {
        return schoolRepository.findByName(name);
    }

    public List<School> getAll() {

        List<School> schools = new ArrayList<>();
        schoolRepository.findAll().forEach(schools::add);

        return schools;
    }

    public School save(School.SchoolRequest schoolRequest) {

        School school = new School();

        school.setName(schoolRequest.getName());
        school.setAddress(schoolRequest.getAddress());
        school.setPrincipal(principalRepository.findByEmail(schoolRequest.getPrincipalEmail()));

        return schoolRepository.save(school);
    }
}
