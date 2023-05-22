package com.ravindupriyankarapremachandra.maxcinemaproject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class seatDTO {
    private int seat_no;
    private boolean status;
    private int user_id;
}
