package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/tasks")
@RestController
class TasksController {

    @GetMapping
    public List<String> getTasks() {
        return List.of("Record a Video", "Prepare Description", "Publish");
    }

}
