package com.nbu.ejournal.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "school")
@Getter
@Setter
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class School implements Serializable {

    @Id
    private int id;

    private String name;
    private String address;

    @OneToOne (fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "principal_email", nullable = false)
    @JsonManagedReference
    private Principal principal;

    @OneToMany(mappedBy = "school", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Teacher> teachers;

    @OneToMany(mappedBy = "school", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonManagedReference
    @JsonBackReference
    private List<Student> students;

    @Getter
    public static class SchoolRequest {
        private String name;
        private String address;
        private String principalEmail;
    }

}
