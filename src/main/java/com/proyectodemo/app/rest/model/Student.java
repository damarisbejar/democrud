package com.proyectodemo.app.rest.Model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "STUDENT")
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    @Column(name = "ID")
    //@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
    //@SequenceGenerator(name = "id_Sequence", sequenceName = "ID_SEQ")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //@Column
    private String firstname;

    //@Column
    private String lastname;
    @ManyToOne(fetch = FetchType.LAZY,optional = true)
    /*@JoinColumn(name = "student_id")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)*/
    private Task task;

    public Long getId() {
        return id;}

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
