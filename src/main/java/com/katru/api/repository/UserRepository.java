package com.katru.api.repository;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.repository.ListCrudRepository;

import com.katru.api.entity.User;

public interface UserRepository extends ListCrudRepository<User, Long>{

    Page<User> findAll(Pageable pageable);

    Slice<User> findByName(String name, Pageable pageable);

    Optional<User> findByuserName(String userName);

    Optional<User> findByEmail(String email);
    
}
