package com.katru.api.service;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

import com.katru.api.entity.SecurityUser;
import com.katru.api.repository.UserRepository;
import com.katru.api.resource.request.LoginRequest;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TokenService {

    private final UserRepository repository;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;

    public String createToken(LoginRequest request) {
        authenticationManager.authenticate(
            new UsernamePasswordAuthenticationToken(
                request.email(),
                request.password()
            )
        );
        var user = repository.findByEmail(request.email()).map(SecurityUser::new)
            .orElseThrow();
        var jwtToken = jwtService.generateToken(user);
        return jwtToken.toString();
    }

    
    
}
