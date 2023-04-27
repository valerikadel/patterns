package com.company.structural.adapter.external;

public interface Builder {
    Builder name(String name);
    Builder mark(String mark);
    Builder wheel(String wheel);
    Builder length(int length);
    Builder wight(int wight);
    ExternalCar build();
}
