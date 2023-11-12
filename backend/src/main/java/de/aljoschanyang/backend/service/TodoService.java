package de.aljoschanyang.backend.service;

import de.aljoschanyang.backend.model.Todo;
import de.aljoschanyang.backend.repository.TodoRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TodoService {
    private TodoRepo todoRepo;

    public List<Todo> getAllTodos() {
        return todoRepo.findAll();
    }
}
