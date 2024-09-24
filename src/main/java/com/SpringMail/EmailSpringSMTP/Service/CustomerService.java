package com.SpringMail.EmailSpringSMTP.Service;

import com.SpringMail.EmailSpringSMTP.Entity.CustomerData;
import com.SpringMail.EmailSpringSMTP.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepo repo;

    public CustomerData addCustomer(CustomerData customerData) {

        return repo.save(customerData);
    }
}

