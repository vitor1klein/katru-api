package com.katru.api.service;

import java.time.LocalDateTime;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Slice;
import org.springframework.data.domain.Sort;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.katru.api.entity.User;
import com.katru.api.repository.UserRepository;
import com.katru.api.resource.config.MyFirstException;
import com.katru.api.resource.request.RegisterUserRequest;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public User findById (Long idUser){
        return userRepository.findById(idUser).orElseThrow(() -> new MyFirstException(idUser));
    }

    public User findByEmail(String email){
        return userRepository.findByEmail(email).orElseThrow(() -> new UsernameNotFoundException(email));
    }

    public Page<User> findAllPaginated(int page, int size) {
        Sort sort = Sort.by("id").descending();
        PageRequest pr = PageRequest.of(page,size);
        return userRepository.findAll(pr);
    }    

    public Slice<User> findByFirstName(String name, int page, int size){
        PageRequest pr = PageRequest.of(page, size);
        return userRepository.findByName(name, pr);
    }

    public void registerUser (RegisterUserRequest registerUserRequest) {
        // TODO: check if user can be created. Already exists? Has any invalid value?
        var user = User.builder()
            .cpf(registerUserRequest.cpf())
            .name(registerUserRequest.name())
            .email(registerUserRequest.email())
            .phoneNumber(registerUserRequest.phone_number())
            .active(true)
            .userName(registerUserRequest.user_name())
            .password(passwordEncoder.encode(registerUserRequest.password()))
            .roles(registerUserRequest.roles())
            .dtCreation(LocalDateTime.now())
            .build();
        userRepository.save(user);
        }
   

}




