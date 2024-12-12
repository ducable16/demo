package com.something.demo.request;

import com.something.demo.entity.Role;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteUserRequest {
    private Long id;

    public Long getId() {
        return id;
    }

}
