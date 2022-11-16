package com.arqui.market.domain.service;

import com.arqui.market.domain.Role;
import com.arqui.market.domain.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {
    @Autowired
    private RoleRepository roleRepository;

    public List<Role> getAll(){
        return roleRepository.getAll();
    }

    public Role save(Role role){
        return roleRepository.save(role);
    }
}
