package com.SpringMail.EmailSpringSMTP.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RedisHash( value = "Customer")
public class CustomerData {

    @Id
    @Indexed
    private String id;
    private String name;
    private long phone;
    private String email;
}
