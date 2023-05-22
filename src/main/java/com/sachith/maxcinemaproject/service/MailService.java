package com.ravindupriyankarapremachandra.maxcinemaproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {

    @Autowired
    private JavaMailSender javaMailSender;

    public void mailSend(String toEmail, String subject, String body){
        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom("h.h.a.r.p.premachandra@gmail.com");
        message.setTo(toEmail);
        message.setSubject(subject);
        message.setText(body);

        javaMailSender.send(message);
        System.out.println("send mail");
    }
}
