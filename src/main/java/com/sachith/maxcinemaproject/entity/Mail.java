package com.ravindupriyankarapremachandra.maxcinemaproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Mail {

    @Id
    private int Mail_id;
    private String type;
    private String content;
    private int user_id;

    public Mail(int mail_id, String type, String content, int user_id) {
        Mail_id = mail_id;
        this.type = type;
        this.content = content;
        this.user_id = user_id;
    }
}
