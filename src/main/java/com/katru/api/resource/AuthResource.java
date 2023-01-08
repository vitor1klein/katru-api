package com.katru.api.resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.katru.api.repository.UserRepository;
import com.katru.api.resource.request.LoginRequest;
import com.katru.api.service.TokenService;

@RestController
public class AuthResource {
    
    private static final Logger LOG = LoggerFactory.getLogger(AuthResource.class);

    private final TokenService tokenService;
    private final AuthenticationManager authenticationManager;
    private final PasswordEncoder passwordEncoder;

    public AuthResource(TokenService tokenService, AuthenticationManager authenticationManager, PasswordEncoder passwordEncoder) {
        this.tokenService = tokenService;
        this.authenticationManager = authenticationManager;
        this.passwordEncoder = passwordEncoder;
    }

    @PostMapping("/token")
    public String token(@RequestBody LoginRequest userLogin) {
        Authentication authentication = authenticationManager.authenticate(
            new UsernamePasswordAuthenticationToken(
                userLogin.userName(), 
                passwordEncoder.encode(userLogin.password())
            )
        );

        // var user = userRepository.findByEmail(userLogin.userName()).orElseThrow();
        
        LOG.debug("Token requested for user: '{}'", userLogin.toString());
        String token = tokenService.generateToken(authentication);
        LOG.debug("Token granted {}", token);
        return token;
    }
    
}
