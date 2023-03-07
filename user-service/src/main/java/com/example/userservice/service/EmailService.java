package com.example.userservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailService {
    private final JavaMailSender mailSender;
    public Boolean sendEmail(String toEmail, String message){
        try {

            SimpleMailMessage email = new SimpleMailMessage();
            email.setFrom("JavaN4");
            email.setTo(toEmail);
            email.setSubject("Java N4");
            email.setText(message);

            mailSender.send(email);

            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
}
