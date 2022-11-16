package com.arqui.market.domain.service;

import com.arqui.market.domain.User;
import com.arqui.market.domain.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private UserRepository userRepository;

    public List<User> getAll() {
        return userRepository.getAll();
    }

    public Optional<User> getByUser(String id) {
        return userRepository.getByUser(id);
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public Boolean delete(String id) {
        return getByUser(id).map(user -> {
            userRepository.delete(id);
            return true;
        }).orElse(false);
    }
}
