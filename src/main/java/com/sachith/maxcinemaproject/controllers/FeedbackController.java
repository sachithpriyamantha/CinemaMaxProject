package com.ravindupriyankarapremachandra.maxcinemaproject.controllers;

import com.ravindupriyankarapremachandra.maxcinemaproject.entity.Feedback;
import com.ravindupriyankarapremachandra.maxcinemaproject.models.FeedbackModels;
import com.ravindupriyankarapremachandra.maxcinemaproject.repo.FeedbackRepo;
import com.ravindupriyankarapremachandra.maxcinemaproject.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Random;

@Controller
public class FeedbackController {

    @Autowired
    UserRepo userRepo;

    @Autowired
    FeedbackRepo feedbackRepo;

    @GetMapping("/feedback")
    public String feedback(Model model) {
        String url = "/save_feedback";

        model.addAttribute("url", url);
        model.addAttribute("feedback_data", new FeedbackModels());

        return "feedback";
    }

    @PostMapping("/save_feedback")
    public String save_feedback(@ModelAttribute FeedbackModels feedbackModels) {

        Random rand = new Random();
        int upper_bound = 999999999;
        int rand_number = rand.nextInt(upper_bound);

        Feedback feedback = new Feedback(rand_number, feedbackModels.getName(), feedbackModels.getEmail(), feedbackModels.getMessage(), userRepo.findByUsername(feedbackModels.getName()));
        feedbackRepo.save(feedback);

        return "/login";

    }

    @GetMapping("/feedbacks")
    public ModelAndView feedbacks() {
        ModelAndView mv = new ModelAndView("feedbacks");
        mv.addObject("messages",feedbackRepo.findAll());
        return mv;
    }
}
