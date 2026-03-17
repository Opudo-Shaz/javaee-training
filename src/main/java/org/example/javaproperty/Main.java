package org.example.javaproperty;
//java property is a way to set and get the properties of a class using getter and setter methods.
// It is a common practice in Java to use properties to encapsulate the fields of a class and provide
public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setName("Alice");
        user.setAge(30);
        user.setCountry("USA");

        User user1 = new User();
        user1.setName("Bob");
        user1.setAge(25);
        user1.setCountry("UK");

        System.out.println("User: " + user);
        System.out.println("User1: " + user1);
    }
}
