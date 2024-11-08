package io.github.com.marcosgsilva.toApi.adapter.infra;

import io.github.com.marcosgsilva.toApi.domain.ports.TodoRepositoryPort;
import io.github.com.marcosgsilva.toApi.domain.ports.TodoServicePort;
import io.github.com.marcosgsilva.toApi.domain.services.TodoService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }

    @Bean
    public TodoServicePort todoServicePort(TodoRepositoryPort todoRepositoryPort){
        return new TodoService(todoRepositoryPort);
    }
}
