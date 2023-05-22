package com.ravindupriyankarapremachandra.maxcinemaproject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDTO {

    private int id;
    private String username;
    private String password;
    private String phone_number;
}
