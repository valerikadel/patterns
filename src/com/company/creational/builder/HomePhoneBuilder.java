package com.company.creational.builder;

public class HomePhoneBuilder implements Builder {
    int id;
    String name;
    @Override
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
        return this;
    }
    @Override
    public Builder memoryCapacity(int memoryCapacity) {
        return this;
    }
    @Override
    public Builder cameraSize(double cameraSize) {
        return this;
    }
    public Phone build(){
        return new Phone(id,name,null,0,0);
    }
}
