package de.aljoschanyang.backend.controller;

import de.aljoschanyang.backend.model.Todo;
import de.aljoschanyang.backend.service.TodoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/todos")
public class TodoController {
    private TodoService todoService;

    @GetMapping("")
    public List<Todo> getAllTodos() {
        return todoService.getAllTodos();
    }
}
