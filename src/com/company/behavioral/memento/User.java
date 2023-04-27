package com.company.behavioral.memento;

public class User {
    private String name;
    private int age;
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public MementoUser makeSnapshot() {
        return new MementoUser(this.name, this.age);
    }
    public void restore(MementoUser mementoUser) {
        this.name = mementoUser.getName();
        this.age = mementoUser.getAge();
    }
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public static class MementoUser {
        private final String name;
        private final int age;
        public MementoUser(String name, int age) {
            this.name = name;
            this.age = age;
        }
        private String getName() {
            return name;
        }
        private int getAge() {
            return age;
        }
    }
}
