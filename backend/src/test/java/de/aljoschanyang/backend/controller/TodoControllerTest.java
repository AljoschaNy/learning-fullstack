package de.aljoschanyang.backend.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import de.aljoschanyang.backend.model.Todo;
import de.aljoschanyang.backend.repository.TodoRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@AutoConfigureMockMvc
class TodoControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private TodoRepo todoRepo;
    @Autowired
    private ObjectMapper objectMapper;

    private static final String BASE_URI = "/api/todos";

    @Test
    void getAllTodos_whenListIsEmpty_thenReturnEmptyList() throws Exception {
        mockMvc.perform(get(BASE_URI))
                .andExpect(status().isOk())
                .andExpect(content().json("[]"));
    }

    @Test
    void getAllTodos_whenTodoIsInList_thenReturnList() throws Exception {
        Todo todo = Todo.builder()
                .id("1")
                .name("Test")
                .build();
        List<Todo> expected = List.of(todo);
        String expectedAsJson = objectMapper.writeValueAsString(expected);
        todoRepo.save(todo);

        mockMvc.perform(get(BASE_URI))
                .andExpect(status().isOk())
                .andExpect(content().json(expectedAsJson));
    }
}