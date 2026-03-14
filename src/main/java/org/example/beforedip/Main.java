package org.example.beforedip;

public class Main {
    public static void main(String[] args) {
        // Before DIP: FileManager creates and owns CloudStorage
        // Hard to test, hard to swap implementations
        FileManager manager = new FileManager();
        manager.save("photo.png");
    }
}

