package com.ravindupriyankarapremachandra.maxcinemaproject.controllers;

import com.ravindupriyankarapremachandra.maxcinemaproject.entity.Mail;
import com.ravindupriyankarapremachandra.maxcinemaproject.entity.Users;
import com.ravindupriyankarapremachandra.maxcinemaproject.models.CheckUsers;
import com.ravindupriyankarapremachandra.maxcinemaproject.models.GetUsers;
import com.ravindupriyankarapremachandra.maxcinemaproject.repo.MailRepo;
import com.ravindupriyankarapremachandra.maxcinemaproject.repo.UserRepo;
import com.ravindupriyankarapremachandra.maxcinemaproject.service.MailService;
import com.ravindupriyankarapremachandra.maxcinemaproject.service.UserService;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.Random;

@Controller
public class UserController {

    /** inject user repository to this class**/
    @Autowired
    UserRepo userRepo;

    /** inject user service to this class**/
    @Autowired
    UserService userService;

    /** inject Mail service to this class**/
    @Autowired
    private MailService mailService;

    /** inject mail repository to this class**/

    @Autowired
    MailRepo mailRepo;

    /*** Get time ***/

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    LocalDateTime now = LocalDateTime.now();

    /**generate Random Number **/
    Random rand = new Random();
    int upperBound = 999999999;
    int rand_number = rand.nextInt(upperBound);

    @GetMapping("/login")
    public String login(Model model,@ModelAttribute CheckUsers checkUsers, HttpServletResponse response){
        Cookie cookie = new Cookie("USERNAME",checkUsers.getUsername());
        response.addCookie(cookie);
        model.addAttribute("checking",new CheckUsers());
        return "login";
    }

    @GetMapping("/register")
    public String register( Model model){
        model.addAttribute("userData",new GetUsers());
        return "register";
    }

    @PostMapping("/register_user")
    public String register_users(@ModelAttribute GetUsers getUsers, Model model){

        try {
            if (Objects.equals(getUsers.getPassword(), getUsers.getRetypePassword())) {
                Users users = new Users(rand_number, getUsers.getUsername(), getUsers.getPassword(), getUsers.getPhNumber(), getUsers.getEmail(),"user");
                userRepo.save(users);

                mailService.mailSend(getUsers.getEmail(), "Max Cinema Registered Message",
                        "you are registered successfully to Max Cinema\n Registration time is:"+dtf.format(now));

                Mail mail = new Mail(rand_number,"registration","registration successful",userRepo.findByUsername(getUsers.getUsername()));
                mailRepo.save(mail);

            }
        }catch (Exception e){
            System.out.println(e); //use this exception for stop crash the program
        }
        model.addAttribute("checking",new CheckUsers());

        return "login";
    }

    @PostMapping("/checkUser")
    public String checkUsers(@ModelAttribute CheckUsers checkUsers, HttpServletResponse response){


        /***Check password matches or not ***/

        if(Objects.equals(checkUsers.getPassword(), userRepo.pass(checkUsers.getUsername()))){
            Cookie cookie = new Cookie("USERNAME",checkUsers.getUsername());
            response.addCookie(cookie);

            /*** send mail as a alert( user login alert) ***/

            mailService.mailSend((userRepo.findByEmailMatches(checkUsers.getUsername())),"Max Cinema Login Message",
                    "you are login successfully to Max Cinema\n login time is:"+dtf.format(now));

            Mail mail = new Mail(rand_number,"registration","registration successful",userRepo.findByUsername(checkUsers.getUsername()));
            mailRepo.save(mail);

            return "redirect:http://127.0.0.1:8080/home";

        }

        return "redirect:http://127.0.0.1:8080/register";
    }
}
