package de.aljoschanyang.backend.service;

import de.aljoschanyang.backend.repository.TodoRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TodoService {
    private TodoRepo todoRepo;


}
