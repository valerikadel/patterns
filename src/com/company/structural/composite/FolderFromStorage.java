package com.company.structural.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FolderFromStorage implements FileStorage {
    protected String name;
    protected List<FileStorage> files = new ArrayList<>();
    public FolderFromStorage(String name, FileStorage... files) {
        this.name = name;
        this.files.addAll(Arrays.asList(files));
    }
    @Override
    public void showItself() {
        System.out.println(String.format("Im folder - %s", name));
        files.forEach(FileStorage::showItself);
    }
}
