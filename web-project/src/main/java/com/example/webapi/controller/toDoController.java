package com.example.webapi.controller;

import com.example.webapi.Model.ToDo;
import com.example.webapi.Model.User;
import com.example.webapi.services.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("http://localhost:3000")
@RestController

@RequestMapping("/todo")

public class toDoController {
    @Autowired
    ToDoService toDoService;

    @GetMapping
    public List<ToDo> getTasks() {
        return toDoService.getTasks();
    }

    @GetMapping
    @RequestMapping("/{Id}")
    public ToDo getById(@PathVariable String Id) {return toDoService.getById(Long.parseLong(Id));
    }
    @GetMapping
    @RequestMapping("getByUserId/{Id}")
    public List<ToDo> getByUserId(@PathVariable String Id) {
        return toDoService.getByUserId(Long.parseLong(Id));
    }


    @PostMapping
    public ToDo add(@RequestBody ToDo t) {
        return  toDoService.add(t);
    }

    @PutMapping("/{id}")
    public ToDo put(@RequestBody ToDo t, @PathVariable Long id) {
        return toDoService.put(t, id);
    }

    @DeleteMapping("/{id}")
    public Long deleteById(@PathVariable Long id) {
        toDoService.deleteById(id);
        return id;
    }
}


