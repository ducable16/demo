package com.something.demo.service;

import com.something.demo.request.LoginRequest;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.security.authentication.AuthenticationManager;
import java.util.Date;

@Service
public class LoginService {

    private final AuthenticationManager authenticationManager;

    private final String SECRET_KEY = "jf03exYR6yY7VdafcvxvzCU9ZTE8e020a819ydvc1a";

    public LoginService(AuthenticationManager authenticationManager) {
        this.authenticationManager = authenticationManager;
    }

    public String login(
            @RequestBody LoginRequest request) {
        System.out.println("Not authenticated!!!!!!!!!!!!!!");
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword())
        );
        System.out.println("Authenticated!!!!!!!!!!!!!!");
        String token = Jwts.builder()
                .setSubject(request.getUsername())
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 10))
                .signWith(SignatureAlgorithm.HS256, SECRET_KEY)
                .compact();
        return token;
    }
}




