package com.nbu.ejournal.model;

import java.util.List;

public class Teacher extends User {

    private List<Student> students;
    private List<School.Subject> subjects;

    public Teacher(String firstName, String lastName) {
        super(firstName, lastName);
    }

}
