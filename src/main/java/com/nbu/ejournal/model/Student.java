package com.nbu.ejournal.model;

import java.util.List;

public class Student extends User{

    private List<Teacher> teachers;
    private List<Parent> parents;

    public Student(String firstName, String lastName) {
        super(firstName, lastName);
    }

}
