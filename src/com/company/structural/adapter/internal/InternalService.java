package com.company.structural.adapter.internal;

public interface InternalService {
    InternalCar build(String name,String mark,String wheel,int length,int weight);
    InternalCar buildOwn();
}
