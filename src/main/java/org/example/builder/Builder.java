package org.example.builder;

public class Builder implements UserBuilder {
    String name;
    int age;
    String country;

    @Override
    public Builder name(String name){
        this.name = name;
        return this;
    }

    @Override
    public Builder age(int age){
        this.age = age;
        return this;
    }

    @Override
    public Builder country(String country){
        this.country = country;
        return this;
    }

    @Override
    public User build(){
        return new User(this);
    }
}
