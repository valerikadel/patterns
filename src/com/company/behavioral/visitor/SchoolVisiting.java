package com.company.behavioral.visitor;

public class SchoolVisiting implements PlaceForVisiting {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitSchool(this);
    }
}
