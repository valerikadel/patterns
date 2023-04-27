package com.company.structural.adapter.internal;

public class InternalServiceImpl implements InternalService {
    @Override
    public InternalCar build(String name,String mark,String wheel,int length,int weight) {
        return new InternalCar(name,mark,wheel,length,weight);
    }
    @Override
    public InternalCar buildOwn() {
        return new InternalCar("allegedly ru","china","left",1000,1000);
    }
}
