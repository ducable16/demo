package com.something.demo.request;

import org.springframework.context.annotation.Configuration;

@Configuration
public class LoginRequest {
    private String username;
    private String password;

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }
}
