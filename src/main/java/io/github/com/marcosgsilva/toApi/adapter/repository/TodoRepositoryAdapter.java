package io.github.com.marcosgsilva.toApi.adapter.repository;

import io.github.com.marcosgsilva.toApi.adapter.entities.TodoEntity;
import io.github.com.marcosgsilva.toApi.domain.Todo;
import io.github.com.marcosgsilva.toApi.domain.ports.TodoRepositoryPort;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@AllArgsConstructor
public class TodoRepositoryAdapter implements TodoRepositoryPort {


    private final TodoRepository todoRepository;
    private final ModelMapper modelMapper;


    @Override
    public Todo saveTodo(Todo todo) {
        TodoEntity entity = modelMapper.map(todo,TodoEntity.class);
        TodoEntity save =  todoRepository.save(entity);
        return modelMapper.map(save, Todo.class);
    }

    @Override
    public List<Todo> findAll(){
        List<TodoEntity> all = todoRepository.findAll();

        return all.stream().map(todoEntity -> modelMapper.map(todoEntity, Todo.class))
                .collect(Collectors.toList());
    }
}
