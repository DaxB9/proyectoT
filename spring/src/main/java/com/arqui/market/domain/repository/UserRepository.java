package com.arqui.market.domain.repository;

import com.arqui.market.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {

    List<User> getAll();
    Optional<User> getByUser(String id);
    User save(User user);
    void delete(String id);
}
