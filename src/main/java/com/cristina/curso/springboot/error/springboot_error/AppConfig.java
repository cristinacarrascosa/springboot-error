package com.cristina.curso.springboot.error.springboot_error;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cristina.curso.springboot.error.springboot_error.models.domain.Role;
import com.cristina.curso.springboot.error.springboot_error.models.domain.User;

@Configuration
public class AppConfig {
     @Bean
    List<User> users() {
        List<User> users = new ArrayList<>();
        users.add(new User(1L, "Cristina", "Gonzalez"));
        users.add(new User(2L, "John", "Doe"));
        users.add(new User(3L, "Jane", "Doe"));
        users.add(new User(4L, "Alice", "Smith"));
        users.add(new User(5L, "Bob", "Johnson"));
       User userWithRole = new User(6L, "Charlie", "Brown");
        userWithRole.setRole(new Role("Admin"));
        users.add(userWithRole);
        return users;
    }


}
