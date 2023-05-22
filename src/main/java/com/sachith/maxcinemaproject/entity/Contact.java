package com.ravindupriyankarapremachandra.maxcinemaproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Contact {

    @Id
    private int id;
    private String name;
    private String email;
    private String phone_number;
    private String message;
    private int user_id;

    public Contact(int id, String name, String email, String phone_number, String message, int user_id) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone_number = phone_number;
        this.message = message;
        this.user_id = user_id;
    }
}
