package com.arqui.market.domain.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MarketUserDetailsService implements UserDetailsService{

    private static List<User> users = new ArrayList();

    public MarketUserDetailsService() {
        users.add(new User("admin", "{noop}admin", new ArrayList<>()));
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // TODO ir a BD por usuarios o sistemas AUTH0
        Optional<User> user = users.stream().filter(u -> u.getUsername().equals(username)).findAny();
        if (!user.isPresent()) {
            throw new UsernameNotFoundException("User not found by name: " + username);
        }
        return new User(user.get().getUsername(), user.get().getPassword(), user.get().getAuthorities());
    }


//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        return new User("admin","{noop}admin", new ArrayList<>());
//    }
}
