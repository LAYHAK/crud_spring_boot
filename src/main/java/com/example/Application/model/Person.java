package com.example.Application.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
public class Person {
    private static long nextId = 0;
    private Long id;
    private String name;
    private String email;
    public Person() {
        this.id = ++nextId;
    }
}
