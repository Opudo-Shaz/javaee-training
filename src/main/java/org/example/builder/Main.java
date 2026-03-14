package org.example.builder;

public class Main {
    public static void main(String[] args) {
        User user = new User.Builder()
                .name("Alice")
                .age(30)
                .country("USA")
                .build();

        System.out.println("User: " + user);
    }
}
