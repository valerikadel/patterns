package com.company.structural.composite;

public class Main {
    public static void main(String[] args) {
        WorkService service = new WorkService();
        service.setStorage(new FileFromStorage("file1"),
                new FileFromStorage("file2"),
                new FileFromStorage("file3"),
                new FolderFromStorage("folder2",
                        new FileFromStorage("file21"),new FileFromStorage("file22"),new FileFromStorage("file23")),
                new FileFromStorage("end file")
                );
        service.showAll();
    }
}
