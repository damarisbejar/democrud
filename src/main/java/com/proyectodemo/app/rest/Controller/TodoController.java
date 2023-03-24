package com.proyectodemo.app.rest.Controller;

import com.proyectodemo.app.rest.model.Task;
import com.proyectodemo.app.rest.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TodoController {
    @Autowired
    private TodoRepository todoRepository;

    @GetMapping(value = "/")
    public String helloWorld(){
        return "Hello world";
    }

    @GetMapping(value = "/tasks")
    public List<Task> getTasks(){

        return todoRepository.findAll();
    }

    @PostMapping(value = "/savetask")
    public String saveTasks(@RequestBody Task task){
        todoRepository.save(task);
        return "Saved task";
    }
    @PutMapping(value="/update/{id}")
    public String updateTask(@PathVariable Long id, @RequestBody Task task){
        Optional<Task> updatedTask = todoRepository.findById(id);
        if (updatedTask.isPresent()){
            updatedTask.get().setTitle(task.getTitle());
            updatedTask.get().setDescription(task.getDescription());
            todoRepository.save(updatedTask.get());
            return  "Updated Task";
        }
        else return "Task not updated";

    }

    @DeleteMapping(value = "/delete/{id}")
    public String deleteTask(@PathVariable Long id){
        Task deletedTask = todoRepository.findById(id).get();
        todoRepository.delete(deletedTask);
        return "Deleted Task";
    }
}
