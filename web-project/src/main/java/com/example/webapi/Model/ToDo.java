package com.example.webapi.Model;

import jakarta.persistence.*;

import java.util.List;
@Entity
@Table(name="ToDo")
public class ToDo  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long i=Long.valueOf(0);
    private Long userId;
    private String title;
    private boolean completed;

    public ToDo() {
    }

    public ToDo(Long userid ,String title, boolean completed) {
        this.id = i++;
        this.userId=userid;
        this.title = title;
        this.completed = completed;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long user) {
        this.userId = user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "ToDo{" +
                "userId=" + userId +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", completed=" + completed +
                '}';
    }
}
