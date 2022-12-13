package com.katru.api.service;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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

    public List<User> findAllPaginated(int page, int size) {
        Pageable pageConfig = PageRequest.of(page, size);
        return userRepository.findAllPaginated(pageConfig);
    }

    

}



// TODO: when you are going to create a web server, check the video from Dan Vega about the sprint in minute 39
