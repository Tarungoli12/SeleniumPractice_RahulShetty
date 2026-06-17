package com.Selenium;

import com.github.javafaker.Faker;

public class RandomNameGenerator {
    public static void main(String[] args) {

        Faker faker = new Faker();

        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        System.out.println(firstName + " " + lastName);
    }
}
