package com.proyectodemo.app.rest.Controller;

import com.proyectodemo.app.rest.Model.Student;

import com.proyectodemo.app.rest.Repository.StudentRepository;
import com.proyectodemo.app.rest.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/student")
    public Student createStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }

}
