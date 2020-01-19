package com.nbu.ejournal.model;

import com.fasterxml.jackson.annotation.*;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "principal")
@Getter
@Setter
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Principal implements Serializable {

    @Id
    private String email;

    @OneToOne(mappedBy = "principal", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonBackReference
    private School school;

}
