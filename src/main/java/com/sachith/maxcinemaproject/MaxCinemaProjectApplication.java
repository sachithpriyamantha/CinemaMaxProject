package com.ravindupriyankarapremachandra.maxcinemaproject;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MaxCinemaProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(MaxCinemaProjectApplication.class, args);
    }

    //use bean annotation for add model mapper to this project this use for transfer data from service to data dto class
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
