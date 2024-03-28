package io.springrestuserdatabase.persistence.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class User {

    @Id @GeneratedValue(strategy = GenerationType.AUTO) private Long id;
    private String firstName;
    private String lastName;
    private LocalDate birthday;
}
