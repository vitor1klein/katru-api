package com.katru.api.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
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

    public Page<User> findAllPaginated(int page, int size) {
        Sort sort = Sort.by("id").descending();
        PageRequest pr = PageRequest.of(page,size);
        return userRepository.findAll(pr);
    }

    

}




