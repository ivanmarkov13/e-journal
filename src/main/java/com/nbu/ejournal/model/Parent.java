package com.nbu.ejournal.model;

import java.util.List;

public class Parent extends User {

    private List<Student> kids;

    public Parent(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public void setKids(List<Student> kids) {
        this.kids = kids;
    }
}
