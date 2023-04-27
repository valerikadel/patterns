package com.company.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MainVisitorImpl visitor = new MainVisitorImpl();
        List<PlaceForVisiting> places = new ArrayList<>();
        places.add(new BankVisiting());
        places.add(new SchoolVisiting());
        places.add(new BeachVisiting());
        places.add(new HomeVisiting());
        places.add(new BankVisiting());
        visitor.visitPlaces(places);
    }
}
