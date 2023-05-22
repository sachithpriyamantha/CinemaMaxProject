package com.ravindupriyankarapremachandra.maxcinemaproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Payments {

    @Id
    private int payment_id;
    private double amount;
    private String pay;
    private int user_id;

    public Payments(int payment_id, double amount, String pay, int user_id) {
        this.payment_id = payment_id;
        this.amount = amount;
        this.pay = pay;
        this.user_id = user_id;
    }
}
