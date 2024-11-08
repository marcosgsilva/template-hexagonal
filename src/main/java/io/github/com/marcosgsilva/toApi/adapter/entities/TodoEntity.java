package io.github.com.marcosgsilva.toApi.adapter.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="TODO")
public class TodoEntity {
    @Id
    @GeneratedValue
    private Integer id;

    private String description;
    private Boolean done;
}
