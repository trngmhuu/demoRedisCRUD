package com.fit.se.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@RedisHash(value = "Employee")
public class Employee implements Serializable {

    @Id
    @Indexed
    private int id;
    private String firstName;
    private String lastName;
    private String email;

}
