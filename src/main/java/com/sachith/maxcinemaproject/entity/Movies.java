package com.ravindupriyankarapremachandra.maxcinemaproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
public class Movies {

    @Id
    private int id;
    private String name;
    private Date release_date;
    private String img_link;

    public Movies(int id, String name, Date release_date, String img_link) {
        this.id = id;
        this.name = name;
        this.release_date = release_date;
        this.img_link = img_link;
    }
}
