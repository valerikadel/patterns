package com.company.behavioral.visitor;

import java.util.List;

public class MainVisitorImpl implements Visitor {
    public void visitPlaces(List<PlaceForVisiting> places){
        places.forEach(p->p.accept(this));
    }
    @Override
    public void visitBank(BankVisiting bank) {
        System.out.println("посетили банк");
    }
    @Override
    public void visitBeach(BeachVisiting beach) {
        System.out.println("посетили пляж");
    }
    @Override
    public void visitHome(HomeVisiting home) {
        System.out.println("посетили дом");
    }
    @Override
    public void visitSchool(SchoolVisiting school) {
        System.out.println("посетили школу");
    }
}
