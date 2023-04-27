package com.company.structural.adapter.external;

public class ExternalCar {
    private String name;
    private String mark;
    private String wheel;
    private int length;
    private int wight;

    public String getName() {
        return name;
    }

    public String getMark() {
        return mark;
    }

    public String getWheel() {
        return wheel;
    }

    public int getLength() {
        return length;
    }

    public int getWight() {
        return wight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setWheel(String wheel) {
        this.wheel = wheel;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWight(int wight) {
        this.wight = wight;
    }

    protected ExternalCar(String name, String mark, String wheel, int length, int wight) {
        this.name = name;
        this.mark = mark;
        this.wheel = wheel;
        this.length = length;
        this.wight = wight;
    }
}
