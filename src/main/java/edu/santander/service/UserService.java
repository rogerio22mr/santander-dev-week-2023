package edu.santander.service;

import edu.santander.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);

}
