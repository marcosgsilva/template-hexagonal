package io.github.com.marcosgsilva.toApi.domain.ports;

import io.github.com.marcosgsilva.toApi.domain.Todo;

import java.util.List;

public interface TodoRepositoryPort {

    Todo saveTodo (Todo todo);

    List<Todo> findAll();
}
