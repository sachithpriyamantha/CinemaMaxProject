package com.ravindupriyankarapremachandra.maxcinemaproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CookiesController {

    @GetMapping("/check_cookies/{film_name}")
    public String check_cookies(@CookieValue(value = "USERNAME")String username, @PathVariable("film_name")String name){
        if (username != null){


            String url = name+"/"+username;
            return "redirect:http://127.0.0.1:8080/seats/"+url;
        }
        return "redirect:http://127.0.0.1:8080/login";

    }
}
