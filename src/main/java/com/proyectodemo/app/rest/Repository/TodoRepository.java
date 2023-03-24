package com.proyectodemo.app.rest.Repository;
import  com.proyectodemo.app.rest.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TodoRepository extends JpaRepository<Task, Long> {

}
