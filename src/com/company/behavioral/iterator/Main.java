package com.company.behavioral.iterator;

public class Main {
    public static void main(String[] args) {
        BodyCheck bodyCheck = new BodyCheck();
        bodyCheck.add(new Doctor("терапевт"));
        bodyCheck.add(new Doctor("окулист"));
        bodyCheck.add(new Doctor("дерматолог"));
        bodyCheck.add(new Doctor("кардиолог"));
        bodyCheck.add(new Doctor("пульмонолога"));

        Iterator iterator = bodyCheck.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.getNext());
        }
    }
}
