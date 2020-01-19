package com.nbu.ejournal.controller;

import com.nbu.ejournal.model.Principal;
import com.nbu.ejournal.service.PrincipalService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("principal")
@AllArgsConstructor
public class PrincipalController {

    private PrincipalService principalService;

    @GetMapping
    public Principal getByEmail(@RequestParam String email, @RequestParam(required = false) String schoolName) {

        if (schoolName != null) {
            return principalService.getBySchoolName(schoolName);
        }

        return principalService.getByEmail(email);
    }

    @PostMapping
    public Principal save(@RequestBody Principal principal) {
        return principalService.save(principal);
    }

}
