package com.arqui.market.persistence;

import com.arqui.market.domain.User;
import com.arqui.market.domain.repository.UserRepository;
import com.arqui.market.persistence.crud.UserCrudRepository;
import com.arqui.market.persistence.entity.Usuario;
import com.arqui.market.persistence.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class UsuarioRepository implements UserRepository {
    @Autowired
    private UserCrudRepository userCrudRepository;

    @Autowired
    private UserMapper mapper;

    @Override
    public List<User> getAll() {
        List<Usuario> usuarios = (List<Usuario>) userCrudRepository.findAll();
        return mapper.toUsers(usuarios);
    }

    @Override
    public Optional<User> getByUser(String id) {
        return userCrudRepository.findById(id).map(usuario -> mapper.toUser(usuario));
    }

    @Override
    public User save(User user) {
        Usuario usuario = mapper.toUsuario(user);
        return mapper.toUser(userCrudRepository.save(usuario));
    }

    @Override
    public void delete(String id) {
        userCrudRepository.deleteById(id);
    }
}
