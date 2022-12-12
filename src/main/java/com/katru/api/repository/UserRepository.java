package com.katru.api.repository;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.katru.api.entity.User;

public interface UserRepository extends PagingAndSortingRepository<User, Long> , ListCrudRepository<User, Long>{

}
