package com.ravindupriyankarapremachandra.maxcinemaproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Cookies {
    @Id
    private int id;
    private String name;

    public Cookies(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
