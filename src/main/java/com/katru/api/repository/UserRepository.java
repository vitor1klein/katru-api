package com.katru.api.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.repository.ListCrudRepository;

import com.katru.api.entity.User;

// PagingAndSortingRepository<User, Long> , 
public interface UserRepository extends ListCrudRepository<User, Long>{

    Page<User> findAll(Pageable pageable);

    Slice<User> findByUserName(String name, Pageable pageable);
}
