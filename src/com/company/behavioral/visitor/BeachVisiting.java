package com.company.behavioral.visitor;

public class BeachVisiting implements PlaceForVisiting {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitBeach(this);
    }
}
