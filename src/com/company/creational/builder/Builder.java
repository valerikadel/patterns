package com.company.creational.builder;

public interface Builder {
    Builder id(int id);
    Builder name(String name);
    Builder system(String system);
    Builder memoryCapacity(int memoryCapacity);
    Builder cameraSize(double cameraSize);
}
