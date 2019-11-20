package com.nbu.ejournal.model;

import java.util.List;

public class School {

    public enum Subject {
        MATHS,
        GEOGRAPHY,
        ENGLISH,
        ARTS,
        SPORTS
    }

    private String address;
    private List<Student> students;
    private List<Teacher> teachers;

}
