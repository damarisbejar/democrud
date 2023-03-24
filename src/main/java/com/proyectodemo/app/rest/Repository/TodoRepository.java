package com.proyectodemo.app.rest.Repository;
import  com.proyectodemo.app.rest.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TodoRepository extends JpaRepository<Task, Long> {

}
