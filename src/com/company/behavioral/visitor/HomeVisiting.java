package com.company.behavioral.visitor;

public class HomeVisiting implements PlaceForVisiting {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitHome(this);
    }
}
