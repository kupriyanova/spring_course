package com.kev.spring;

public class Dog implements Pet {

    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }
}
