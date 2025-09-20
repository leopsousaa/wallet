package org.wallet.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wallet.entity.User;
import org.wallet.repository.UserRepository;
import org.wallet.service.UserService;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository repository;

    @Override
    public User save(User u) {
        return repository.save(u);
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return repository.findByEmailEquals(email);
    }
}
