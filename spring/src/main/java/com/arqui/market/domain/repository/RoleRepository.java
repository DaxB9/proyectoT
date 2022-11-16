package com.arqui.market.domain.repository;

import com.arqui.market.domain.Role;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface RoleRepository {
    //    void delete(int productId);

    List<Role> getAll();
    Role save(Role role);
}
