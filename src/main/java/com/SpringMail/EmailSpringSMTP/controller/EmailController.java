package com.SpringMail.EmailSpringSMTP.controller;

import com.SpringMail.EmailSpringSMTP.Entity.EmailDetails;
import com.SpringMail.EmailSpringSMTP.Service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
    private final EmailService emailService;

    @Autowired
    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping("/send")
    public String sendMail(@RequestBody EmailDetails details) {
        return emailService.sendSimple(details);
    }

    @PostMapping("/sendAttachment")
    public  String sendMailWithAttachment(@RequestBody EmailDetails details) {
        String status = emailService.sendMailWithAttrachment(details);
        return status;

        //bisa juga dengan cara ini
//        return emailService.sendMailWithAttrachment(details);
    }

}
