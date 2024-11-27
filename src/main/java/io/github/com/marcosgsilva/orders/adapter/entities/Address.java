package io.github.com.marcosgsilva.orders.adapter.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UuidGenerator;


import java.util.UUID;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "TB_ADDRESS")
@Entity
public class Address {
    @Id
    @UuidGenerator
    @Column(updatable = false, nullable = false)
    private UUID id;
    @Column(nullable = false, length = 100)
    private String street;
    @Column(nullable = false, length = 10)
    private String number;
    @Column(nullable = false, length = 10)
    private String complement;
    @Column(nullable = false,length = 50)
    private String neighborhood;
    @Column(nullable = false, length = 50)
    private String city;
    @Column(nullable = false, length = 2)
    private String state;
    @Column(nullable = false, length = 10)
    private String zipCode;

}
