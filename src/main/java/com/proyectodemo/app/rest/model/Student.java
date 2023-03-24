package com.proyectodemo.app.rest.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
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
}
