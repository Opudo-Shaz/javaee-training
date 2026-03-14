package org.example.dependecyinversion;

public class Main {
    public static void main(String[] args) {

        Storage storage = new CloudStorage();

        FileManager manager = new FileManager(storage);

        manager.save("photo.png");
    }
}
