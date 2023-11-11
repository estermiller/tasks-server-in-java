package com.example.webapi.services;

import com.example.webapi.Model.ToDo;
import com.example.webapi.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ToDoService {

    @Autowired
    ToDoRepository toDoRepository;


    public List<ToDo> getTasks() {
        return (List<ToDo>) toDoRepository.findAll();
    }
    public ToDo getById(Long id) {
        return toDoRepository.findById(id).get();
    }

      public List<ToDo> getByUserId(Long userid) {
        return toDoRepository.findToDoByUserId(userid).get();
    }
    public ToDo add(ToDo t) {
       return toDoRepository.save(t);
    }

    public ToDo put(ToDo t, Long id) {
        toDoRepository.deleteById(id);
        toDoRepository.save(t);
        return t;
    }

    public void deleteById(Long id) {
        toDoRepository.deleteById(id);
    }
}
