package com.katru.api.resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.katru.api.resource.request.LoginRequest;
import com.katru.api.service.TokenService;

@RestController
public class AuthResource {
    
    private static final Logger LOG = LoggerFactory.getLogger(AuthResource.class);

    private final TokenService tokenService;

    public AuthResource(TokenService tokenService) {
        this.tokenService = tokenService;
    }

    @PostMapping("/token")
    public String token(@RequestBody LoginRequest userLogin) {        
        LOG.debug("Token requested for user: '{}'", userLogin.email());
        String token = tokenService.createToken(userLogin);
        LOG.debug("Token granted {}", token);
        return token;
    }
    
}
