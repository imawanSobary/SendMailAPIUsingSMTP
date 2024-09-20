package com.SpringMail.EmailSpringSMTP.Service;

import com.SpringMail.EmailSpringSMTP.Entity.EmailDetails;

public interface EmailService {

//    Method
//    To Send just mesassage
    String sendSimple(EmailDetails details);

//    Method
//    To send email with attachment
    String sendMailWithAttrachment(EmailDetails details);



}
