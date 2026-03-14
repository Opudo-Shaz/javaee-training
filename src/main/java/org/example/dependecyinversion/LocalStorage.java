package org.example.dependecyinversion;

public class LocalStorage implements Storage{
    @Override
    public void saveFile(String file) {
        System.out.println("Saving locally: " + file);
    }
}
