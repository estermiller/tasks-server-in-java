package com.example.webapi.services;

import com.example.webapi.Model.User;
import com.example.webapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> getUsers() {
        return (List<User>) userRepository.findAll();
    }

    public User getById(Long userid) {
        return userRepository.findById(userid).get();
    }

    public User getByNameAndEmail(String name,String email){
        return userRepository.findUserByUserNameAndEmail(name,email).get();
       }

    public User add(User u) {
       return userRepository.save(u);
    }

    public User put(User user, Long userid) {
        userRepository.deleteById(userid);
        userRepository.save(user);
        return user;
    }

    public void deletebyId(Long userid) {
        userRepository.deleteById(userid);
    }

}


