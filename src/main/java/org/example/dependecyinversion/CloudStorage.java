package org.example.dependecyinversion;

public class CloudStorage implements Storage{
    @Override
    public void saveFile(String file) {
        System.out.println("Saving to cloud: " + file);
    }
}
