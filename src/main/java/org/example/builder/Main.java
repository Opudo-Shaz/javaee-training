package org.example.builder;

public class Main {
    public static void main(String[] args) {
        User user = new Builder()
                .name("Alice")
                .age(30)
                .country("USA")
                .build();

        System.out.println("User: " + user);
        User user2 = new Builder()
                .name("Bob")
                .age(25)
                .build();
        System.out.println("User: " + user2);
    }
}
