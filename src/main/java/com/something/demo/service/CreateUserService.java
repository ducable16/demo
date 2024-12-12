package com.something.demo.service;

import com.something.demo.entity.Role;
import com.something.demo.entity.User;
import com.something.demo.repository.UserRepository;
import com.something.demo.request.CreateUserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Service
public class CreateUserService {
    @Autowired
    UserRepository userRepository;

    public ResponseEntity<?> createUser(
            @RequestBody CreateUserRequest request) {
//        System.out.println("vao");
        User user = new User(request.getName(), request.getAge(), request.getUsername(), request.getPassword(), request.getRole());
//        System.out.println("vao : " + user.getName());
        return ResponseEntity.ok(userRepository.save(user));
    }
}
