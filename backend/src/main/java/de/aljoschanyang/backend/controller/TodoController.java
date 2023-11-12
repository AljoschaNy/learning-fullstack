package de.aljoschanyang.backend.controller;

import de.aljoschanyang.backend.service.TodoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/todos")
public class TodoController {
    private TodoService todoService;
}
