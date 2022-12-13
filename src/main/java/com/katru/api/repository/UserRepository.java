package com.katru.api.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.katru.api.entity.User;

public interface UserRepository extends PagingAndSortingRepository<User, Long> , ListCrudRepository<User, Long>{

    Page<User> findAllPaginated (Pageable pageable);
}
