package com.example.webapi.repository;

import com.example.webapi.Model.ToDo;
import com.example.webapi.Model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Map;
import java.util.Optional;


public interface UserRepository extends CrudRepository<User,Long> {
       Optional<User> findUserByUserNameAndEmail(String name,String email);
}
