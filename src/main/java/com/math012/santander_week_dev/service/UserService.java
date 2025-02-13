package com.math012.santander_week_dev.service;

import com.math012.santander_week_dev.domain.model.User;

public interface UserService {

    User findById(Long id);
    User create(User userToCreate);

}
