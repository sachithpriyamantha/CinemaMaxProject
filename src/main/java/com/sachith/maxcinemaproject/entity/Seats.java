package com.ravindupriyankarapremachandra.maxcinemaproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Seats {
    @Id
    private int seat_id;
    private int seat_no;
    private boolean status;
    private int user_id;
    private int movie_id;

    public Seats(int seat_id, int seat_no, boolean status, int user_id, int movie_id) {
        this.seat_id = seat_id;
        this.seat_no = seat_no;
        this.status = status;
        this.user_id = user_id;
        this.movie_id = movie_id;
    }
}
