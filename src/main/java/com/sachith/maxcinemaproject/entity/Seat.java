package com.ravindupriyankarapremachandra.maxcinemaproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Seat {
    @Id
    private int seat_no;
    private boolean status;
    private int user_id;

    public Seat(int seat_no, boolean status, int user_id) {
        this.seat_no = seat_no;
        this.status = status;
        this.user_id = user_id;
    }
}
