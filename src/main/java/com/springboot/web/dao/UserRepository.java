package com.springboot.web.dao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.web.model.User;

public interface UserRepository extends CrudRepository<User, String> {
    User getUserByName(String userName);
}
