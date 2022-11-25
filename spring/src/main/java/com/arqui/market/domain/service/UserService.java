package com.arqui.market.domain.service;

import com.arqui.market.domain.User;
import com.arqui.market.domain.repository.UserRepository;
import com.arqui.market.persistence.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<User> getAll() {
        return usuarioRepository.getAll();
    }

    public Optional<User> getByUser(String id) {
        return usuarioRepository.getByUser(id);
    }

    public User save(User user) {
        return usuarioRepository.save(user);
    }

    public Boolean delete(String id) {
        return getByUser(id).map(user -> {
            usuarioRepository.delete(id);
            return true;
        }).orElse(false);
    }
}
