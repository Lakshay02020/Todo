package com.example.Todo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {
    @GetMapping
    public String getTasks(){
        return "No current tasks";
    }
}
