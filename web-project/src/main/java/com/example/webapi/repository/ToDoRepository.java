package com.example.webapi.repository;

import com.example.webapi.Model.ToDo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ToDoRepository extends CrudRepository<ToDo,Long> {
    Optional<List<ToDo>> findToDoByUserId(long userid);
}
