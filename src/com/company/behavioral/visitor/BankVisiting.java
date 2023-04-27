package com.company.behavioral.visitor;

public class BankVisiting implements PlaceForVisiting {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitBank(this);
    }
}
