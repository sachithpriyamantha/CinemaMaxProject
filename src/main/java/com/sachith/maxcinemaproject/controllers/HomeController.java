package com.ravindupriyankarapremachandra.maxcinemaproject.controllers;

import com.ravindupriyankarapremachandra.maxcinemaproject.repo.MoviesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class HomeController {

    @Autowired
    MoviesRepo moviesRepo;
    @GetMapping("/home")
    public ModelAndView home(){
        ModelAndView mav = new ModelAndView("home");
        mav.addObject("Movies", moviesRepo.getAllById(1));
        mav.addObject("Movies2", moviesRepo.getAllById(2));
        mav.addObject("Movies3", moviesRepo.getAllById(3));
        mav.addObject("Movies4", moviesRepo.getAllById(4));
        mav.addObject("Movies5", moviesRepo.getAllById(5));
        mav.addObject("Movies6", moviesRepo.getAllById(6));
        mav.addObject("Movies7", moviesRepo.getAllById(7));
        mav.addObject("Movies8", moviesRepo.getAllById(8));
        mav.addObject("Movies9", moviesRepo.getAllById(9));
        return mav;
    }

    @GetMapping("/about")
    public String about_us(){
        return "about";
    }

    @GetMapping("cinema_list")
    public String cinema_list(){
        return "search";
    }


}
