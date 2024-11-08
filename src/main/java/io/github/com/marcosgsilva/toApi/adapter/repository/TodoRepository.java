package io.github.com.marcosgsilva.toApi.adapter.repository;

import io.github.com.marcosgsilva.toApi.adapter.entities.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<TodoEntity, Integer> {

}
