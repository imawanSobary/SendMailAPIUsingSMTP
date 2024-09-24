package com.SpringMail.EmailSpringSMTP.repository;

import com.SpringMail.EmailSpringSMTP.Entity.CustomerData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends CrudRepository<CustomerData,String> {
}
