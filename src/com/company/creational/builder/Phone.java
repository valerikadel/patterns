package com.company.creational.builder;

public class Phone {
    int id;
    String name;
    String system;
    int memoryCapacity;
    double cameraSize;

    Phone(int id, String name, String system, int memoryCapacity, double cameraSize) {
        this.id = id;
        this.name = name;
        this.system = system;
        this.memoryCapacity = memoryCapacity;
        this.cameraSize = cameraSize;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", system='" + system + '\'' +
                ", memoryCapacity=" + memoryCapacity +
                ", cameraSize=" + cameraSize +
                '}';
    }
}
