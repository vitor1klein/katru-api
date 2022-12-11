package com.katru.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.katru.api.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
