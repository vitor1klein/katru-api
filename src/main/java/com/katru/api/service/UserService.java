package com.katru.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

import com.katru.api.entity.User;
import com.katru.api.repository.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    public List<User> list(){
        return userRepository.findAll();
    }

    /**
     * @param idUser
     * @return
     * @throws NotFoundException
     */
    public User findById(Long idUser) throws NotFoundException{
        return userRepository.findById(idUser).orElseThrow(() -> new NotFoundException());
    }

    // public User save(User user){
    //     return userRepository.save(user);
    // }

}
