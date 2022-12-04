package com.katru.api.repositories;

import com.katru.api.domain.User;
import com.katru.api.exceptions.EtAuthException;

public interface UserRepository {

    Integer create(String firstName, String lastName, String email, String password) throws EtAuthException;

    User findByEmailandPassword(String email, String password) throws EtAuthException;
    
    Integer getCountByEmail (String email);

    User findById(Integer userId); 
}
