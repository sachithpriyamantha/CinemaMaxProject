package com.ravindupriyankarapremachandra.maxcinemaproject.controllers;

import com.ravindupriyankarapremachandra.maxcinemaproject.entity.Contact;
import com.ravindupriyankarapremachandra.maxcinemaproject.models.ContactModels;
import com.ravindupriyankarapremachandra.maxcinemaproject.repo.ContactRepo;
import com.ravindupriyankarapremachandra.maxcinemaproject.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Random;

@Controller
public class ContactController {

    @Autowired
    ContactRepo contactRepo;

    @Autowired
    UserRepo userRepo;

    @GetMapping("/contact")
    public String contact(Model model){

        model.addAttribute("url","/save_contact");
        model.addAttribute("object",new ContactModels());

        return "contact";
    }

    @PostMapping("/save_contact")
    public String save_contact(@ModelAttribute ContactModels contactModels){

        Random rand = new Random();
        int upper_bound = 999999999;

        int rand_number = rand.nextInt(upper_bound);

        Contact contact = new Contact(rand_number,contactModels.getName(),contactModels.getEmail(),contactModels.getPhone_number(),contactModels.getMessage(),userRepo.findByUsername(contactModels.getName()));
        contactRepo.save(contact);


        return "/login";
    }
}
