package com.nbu.ejournal.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Parent extends User {

    private List<Student> kids;

    public Parent(String firstName, String lastName) {

    }

    public void setKids(List<Student> kids) {
        this.kids = kids;
    }
}
