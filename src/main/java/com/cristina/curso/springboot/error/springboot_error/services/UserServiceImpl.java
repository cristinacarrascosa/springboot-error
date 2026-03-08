package com.cristina.curso.springboot.error.springboot_error.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cristina.curso.springboot.error.springboot_error.models.domain.Role;
import com.cristina.curso.springboot.error.springboot_error.models.domain.User;

import exceptions.UserNotFoundException;

@Service
public class UserServiceImpl implements UserService {

    private List<User> users;

    // Emulating a database with hardcoded users
    public UserServiceImpl() {
        this.users = new ArrayList<>();
        users.add(new User(1L, "Cristina", "Gonzalez"));
        users.add(new User(2L, "John", "Doe"));
        users.add(new User(3L, "Jane", "Doe"));
        users.add(new User(4L, "Alice", "Smith"));
        users.add(new User(5L, "Bob", "Johnson"));
        User userWithRole = new User(6L, "Charlie", "Brown");
        userWithRole.setRole(new Role("Admin"));
        users.add(userWithRole);
    }

    @Override
    public Optional<User> findById(Long id) {
        User user = null;
        for (User u : users) {
            if (u.getId().equals(id)) {
                user = u;
                break;
            }
            
        }
        
        return Optional.ofNullable(user);
    }

	@Override
	public List<User> findAll() {
		return users;
	}

}
