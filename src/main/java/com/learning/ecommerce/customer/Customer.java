package com.learning.ecommerce.customer;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Setter
@Getter
@Entity
public class Customer {
    @Id
    private String id;  // UUID as a String

    private String firstName;
    private String lastName;
    private String email;

    public Customer() {
        // Generate UUID without hyphens and set it as the ID
        this.id = generateUUIDWithoutHyphens();
    }

    public Customer(String firstName, String lastName, String email) {
        this.id = generateUUIDWithoutHyphens();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    private String generateUUIDWithoutHyphens() {
        return UUID.randomUUID().toString().replace("-", "");
    }

}
