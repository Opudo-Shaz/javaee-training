package org.example.builder;

/**
 * Interface that defines the contract for building a User object.
 * This allows for different builder implementations and better abstraction.
 */
public interface UserBuilder {
    UserBuilder name(String name);
    UserBuilder age(int age);
    UserBuilder country(String country);
    User build();
}

