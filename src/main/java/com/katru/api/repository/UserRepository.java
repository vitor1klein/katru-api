package com.katru.api.repository;

import com.katru.api.entity.User;

public interface UserRepository {

    Integer create(String firstName, String lastName, String email, String password) throws Exception;

    User findByEmailandPassword(String email, String password) throws Exception;
    
    Integer getCountByEmail (String email);

    User findById(Integer userId); 
}
