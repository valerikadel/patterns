package com.company.behavioral.memento;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setAge(1);
        user.setName("1");
        Editor editor = new Editor(user);
        editor.editUser("2",1);
        editor.print();
        editor.editUser("2",2);
        editor.print();
        editor.editUser("3",3);
        editor.print();

        editor.undo();
        editor.print();
        editor.undo();
        editor.print();
    }
}
