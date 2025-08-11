package com.gomesvh.mod40.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor
@Entity
@Table(name = "TB_USER")
public class User {
    private String firstName;
    private String lastName;
    @Id
    private String email;
}