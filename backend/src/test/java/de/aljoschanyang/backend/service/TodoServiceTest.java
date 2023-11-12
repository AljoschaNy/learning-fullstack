package de.aljoschanyang.backend.service;

import de.aljoschanyang.backend.model.Todo;
import de.aljoschanyang.backend.repository.TodoRepo;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class TodoServiceTest {
    private final TodoRepo mockTodoRepo = mock(TodoRepo.class);
    private final TodoService todoService = new TodoService(mockTodoRepo);

    @Test
    void getAllTodos_whenListIsEmpty_thenReturnEmptyList() {
        when(mockTodoRepo.findAll()).thenReturn(List.of());
        List<Todo> actual = todoService.getAllTodos();
        verify(mockTodoRepo).findAll();
        assertTrue(actual.isEmpty());
    }

    @Test
    void getAllTodos_whenTodoIsInList_thenReturnList() {
        Todo todo = Todo.builder()
                .id("1")
                .name("Test")
                .build();
        List<Todo> expected = List.of(todo);
        mockTodoRepo.save(todo);

        when(mockTodoRepo.findAll()).thenReturn(expected);
        List<Todo> actual = todoService.getAllTodos();
        verify(mockTodoRepo).findAll();
        assertEquals(expected,actual);
    }
}