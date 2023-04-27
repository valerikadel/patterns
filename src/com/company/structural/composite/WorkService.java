package com.company.structural.composite;

public class WorkService {
    private FileStorage storage;
    public WorkService() {
    }
    public void setStorage(FileStorage... files) {
        storage = new FolderFromStorage("mainFolder", files);
    }
    public void showAll() {
        storage.showItself();
    }
}
