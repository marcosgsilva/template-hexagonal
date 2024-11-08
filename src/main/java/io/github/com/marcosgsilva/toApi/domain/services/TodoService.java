package io.github.com.marcosgsilva.toApi.domain.services;

import io.github.com.marcosgsilva.toApi.domain.Todo;
import io.github.com.marcosgsilva.toApi.domain.ports.TodoServicePort;
import io.github.com.marcosgsilva.toApi.domain.ports.TodoRepositoryPort;
import org.springframework.stereotype.Service;

import java.util.List;

public class TodoService implements TodoServicePort {

    private final TodoRepositoryPort todoRepositoryPort;

    public TodoService(TodoRepositoryPort todoRepositoryPort) {
        this.todoRepositoryPort = todoRepositoryPort;
    }


    @Override
    public Todo saveTodo(Todo todo) {
         return this.todoRepositoryPort.saveTodo(todo);

    }

    @Override
    public List<Todo> findAll() {
        return todoRepositoryPort.findAll();
    }
}
