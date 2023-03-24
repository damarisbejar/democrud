package com.proyectodemo.app.rest.Service;

import com.proyectodemo.app.rest.Model.Student;
import com.proyectodemo.app.rest.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImp implements StudentService {
    @Autowired
    StudentRepository studentRepository;
    @Override
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }
}
