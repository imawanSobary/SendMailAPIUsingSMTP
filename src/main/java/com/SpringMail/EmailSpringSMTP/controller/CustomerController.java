package com.SpringMail.EmailSpringSMTP.controller;


import com.SpringMail.EmailSpringSMTP.Entity.CustomerData;
import com.SpringMail.EmailSpringSMTP.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService service;

    @PostMapping
    public CustomerData addCustomer(@RequestBody CustomerData customerData) {
        return service.addCustomer(customerData);
    }

}
