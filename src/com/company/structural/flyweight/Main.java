package com.company.structural.flyweight;

public class Main {
    public static void main(String[] args) {
        ContactBook contactBook = new ContactBook();
        contactBook.fill("Ivan","M","Moscow");
        contactBook.fill("Sveta","F","Moscow");
        contactBook.fill("Alex","M","SP");
        contactBook.fill("Anna","F","SP");
        contactBook.show();
    }
}
