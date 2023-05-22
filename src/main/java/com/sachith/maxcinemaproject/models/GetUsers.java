package com.ravindupriyankarapremachandra.maxcinemaproject.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GetUsers {

    private String username;
    private String password;
    private String phNumber;
    private String retypePassword;
    private String email;

}
