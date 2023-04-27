package com.company.structural.composite;

public class FileFromStorage implements FileStorage {
    protected String name;
    public FileFromStorage(String name) {
        this.name = name;
    }
    @Override
    public void showItself() {
        System.out.println("\tIm file - " + name);
    }
}
