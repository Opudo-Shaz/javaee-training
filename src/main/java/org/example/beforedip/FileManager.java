package org.example.beforedip;

public class FileManager {
    private CloudStorage storage;  // Depends on concrete class, not abstraction

    public FileManager() {
        this.storage = new CloudStorage();  // Tightly coupled instantiation
    }

    public void save(String file) {
        storage.saveFile(file);
    }
}

