package com.company.structural.adapter.external;

public class BuilderImpl implements Builder {
    private String name;
    private String mark;
    private String wheel;
    private int length;
    private int wight;
    @Override
    public Builder name(String name) {
        this.name=name;
        return this;
    }
    @Override
    public Builder mark(String mark) {
        this.mark = mark;
        return this;
    }
    @Override
    public Builder wheel(String wheel) {
        this.wheel = wheel;
        return this;
    }
    @Override
    public Builder length(int length) {
        this.length = length;
        return this;
    }
    @Override
    public Builder wight(int wight) {
        this.wight = wight;
        return this;
    }
    @Override
    public  ExternalCar build(){
        return new ExternalCar(name,mark,wheel,length,wight);
    }
}
