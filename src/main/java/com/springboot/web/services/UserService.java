package com.springboot.web.services;

import com.springboot.web.model.User;

public interface UserService {
    User getUserByUserName(String userName);
}
