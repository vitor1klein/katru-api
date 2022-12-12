package com.katru.api.service;

import org.springframework.stereotype.Service;

import com.katru.api.entity.User;
import com.katru.api.repository.UserRepository;
import com.katru.api.resource.config.MyFirstException;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public User findById (Long idUser){
        return userRepository.findById(idUser).orElseThrow(() -> new MyFirstException(idUser));
    }

    

}



// TODO: when you are going to create a web server, check the video from Dan Vega about the sprint in minute 39
