package org.example.dependecyinversion;

public class FileManager{
    private Storage storage;

    public FileManager(Storage storage){
        this.storage = storage;
    }

    public void save(String file) {
        storage.saveFile(file);
    }

}
