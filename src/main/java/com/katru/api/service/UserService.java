package com.katru.api.service;

import com.katru.api.entity.User;

public interface UserService {
    
    User validateUser(String email, String password) throws Exception;

    User registerUser(String firstName, String lastName, String email, String password) throws Exception;

}
