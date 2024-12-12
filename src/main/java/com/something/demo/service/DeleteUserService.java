package com.something.demo.service;

import com.something.demo.entity.User;
import com.something.demo.repository.UserRepository;
import com.something.demo.request.CreateUserRequest;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Service
public class DeleteUserService {
    @Autowired
    UserRepository userRepository;

    public ResponseEntity<?> deleteUser(
            @RequestParam ObjectId _id) {
        Optional<User> user = userRepository.findById(_id);
        if(!user.isPresent()) return ResponseEntity.status(404).body("Account not found");
        return ResponseEntity.ok(userRepository.deleteById(_id));
    }
}
