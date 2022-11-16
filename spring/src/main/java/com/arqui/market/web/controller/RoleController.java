package com.arqui.market.web.controller;

import com.arqui.market.domain.Role;
import com.arqui.market.domain.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleController {
    @Autowired
    private RoleService roleService;

    @GetMapping("/all")
    public ResponseEntity<List<Role>> getAll(){
        return new ResponseEntity<>(roleService.getAll(), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Role> save(@RequestBody Role role){
        return new ResponseEntity<>(roleService.save(role),HttpStatus.CREATED);
    }

}
