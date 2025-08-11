package com.gomesvh.mod40.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/*@Entity
@Table(name = "TB_USER")*/
public record UserRecord(
        String firstName,
        String lastName,
        @Id
        String email
) {
    public UserRecord {
        if (firstName == null || firstName.isBlank()) {
            throw new IllegalArgumentException("First name cannot be null or blank.");
        }
        if (lastName == null || lastName.isBlank()) {
            throw new IllegalArgumentException("Last name cannot be null or blank.");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("E-mail cannot be null or blank.");
        }
    }
}