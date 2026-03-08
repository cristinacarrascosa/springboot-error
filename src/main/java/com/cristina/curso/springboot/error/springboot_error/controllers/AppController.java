package com.cristina.curso.springboot.error.springboot_error.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cristina.curso.springboot.error.springboot_error.models.domain.User;
import com.cristina.curso.springboot.error.springboot_error.services.UserService;

import exceptions.UserNotFoundException;

@RestController
@RequestMapping("/app")
public class AppController {

    //inyectamos el servicio
    @Autowired
    private UserService service;

    @GetMapping
    public String index() {

        //int a = 1 / 0; // This will cause an ArithmeticException
        int a = Integer.parseInt("10x"); // This will cause a NumberFormatException

        System.out.println(a);
        return "Hello, World!";
    }

    @GetMapping("/show/{id}")
    public User show(@PathVariable(name = "id") Long id) {
        User user = service.findById(id).orElseThrow(() -> new UserNotFoundException("Error este usuario no existe :( !"));
        
        System.out.println(user.getLastname());
        return user;
    }
}
