package org.example.builder;

public class User {
    String name;
    int age;
    String country;

    // Package-private constructor for Builder access
    User(Builder builder){
        this.name = builder.name;
        this.age = builder.age;
        this.country = builder.country;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                '}';
    }
}

