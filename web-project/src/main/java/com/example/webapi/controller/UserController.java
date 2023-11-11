package com.example.webapi.controller;
import com.example.webapi.Model.User;
import com.example.webapi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("http://localhost:3000")

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping
    public List<User> getUsers() {
        return userService.getUsers();
    }
    @GetMapping
    @RequestMapping("/{id}")
    public User getById(@PathVariable Long id) {
        return userService.getById(id);
    }
    @PostMapping
    @RequestMapping("/login")
    public User getByNameAndEmail(@RequestParam String name ,@RequestParam String email) {
        return userService.getByNameAndEmail(name,email);
    }
    @PostMapping
    public User add(@RequestBody User p) {
      return userService.add(p);

    }
    @PutMapping("{id}")
    public User put(@RequestBody User pupil, @PathVariable Long id) {
        return userService.put(pupil,id);}
    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Long id) {
        userService.deletebyId(id);
    }

}
