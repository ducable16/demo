package com.something.demo.request;

import com.something.demo.entity.Role;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CreateUserRequest {
    private String name;
    private int age;
    private String username;
    private String password;
    private Role role;

    public Role getRole() {
        return role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
