package com.example.todo_application.todo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Todo_Application {

    @GetMapping("/todo")
    public String todo(){
        return "To-do Application!";
    }
}
