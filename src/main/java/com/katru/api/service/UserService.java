package com.katru.api.service;

import com.katru.api.domain.User;
import com.katru.api.exceptions.EtAuthException;

public interface UserService {
    
    User validateUser(String email, String password) throws EtAuthException;

    User registerUser(String firstName, String lastName, String email, String password) throws EtAuthException;

}
