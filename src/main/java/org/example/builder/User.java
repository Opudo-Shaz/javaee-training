package org.example.builder;

public class User {
    private String name;
    private int age;
    private String country;

    private User(Builder builder){
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

    public static class Builder {
        private String name;
        private int age;
        private String country;

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder age(int age){
            this.age = age;
            return this;
        }

        public Builder country(String country){
            this.country = country;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }
}

