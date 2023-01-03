package com.katru.api.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Slice;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.katru.api.entity.User;
import com.katru.api.repository.UserRepository;
import com.katru.api.resource.config.MyFirstException;
import com.katru.api.resource.request.CreateUserRequest;

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

    public Slice<User> findByFirstName(String name, int page, int size){
        PageRequest pr = PageRequest.of(page, size);
        return userRepository.findByName(name, pr);
    }

    public void createUser (CreateUserRequest createUserRequest) {
        User user = new User(createUserRequest.cpf(),createUserRequest.email(),createUserRequest.name(),createUserRequest.password());

        // TODO: check if user can be created. Already exists? Has any invalid value?
        userRepository.save(user);

    }

}




