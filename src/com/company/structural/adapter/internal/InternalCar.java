package com.company.structural.adapter.internal;

public class InternalCar {
    private String name;
    private String mark;
    private String wheel;
    private int length;
    private int wight;
    public InternalCar(String name, String mark, String wheel, int length, int wight) {
        this.name = name;
        this.mark = mark;
        this.wheel = wheel;
        this.length = length;
        this.wight = wight;
    }

    @Override
    public String toString() {
        return "InternalCar{" +
                "name='" + name + '\'' +
                ", mark='" + mark + '\'' +
                ", wheel='" + wheel + '\'' +
                ", length=" + length +
                ", wight=" + wight +
                '}';
    }
}
