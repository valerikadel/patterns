package com.company.creational.builder;

public class SmartPhoneBuilder implements Builder {
    int id;
    String name;
    String system;
    int memoryCapacity;
    double cameraSize;
    public Builder id(int id) {
        this.id = id;
        return this;
    }
    @Override
    public Builder name(String name) {
        this.name = name;
        return this;
    }
    @Override
    public Builder system(String system) {
        this.system = system;
        return this;
    }
    @Override
    public Builder memoryCapacity(int memoryCapacity) {
        this.memoryCapacity = memoryCapacity;
        return this;
    }
    @Override
    public Builder cameraSize(double cameraSize) {
        this.cameraSize = cameraSize;
        return this;
    }
    public Phone build() {
        return new Phone(id, name, system, memoryCapacity, cameraSize);
    }
}
