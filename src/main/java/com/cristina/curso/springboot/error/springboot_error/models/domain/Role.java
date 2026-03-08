package com.cristina.curso.springboot.error.springboot_error.models.domain;

public class Role {

    private String name;

    public Role(String string) {
        this.name = string;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
