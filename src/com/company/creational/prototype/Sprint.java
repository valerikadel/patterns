package com.company.creational.prototype;

import java.time.LocalDate;

public class Sprint implements PrototypeSprint {
    String name;
    LocalDate date;

    public Sprint() {
    }

    public Sprint(Sprint sprint) {
        this.name = sprint.name;
        this.date = sprint.date;
    }

    @Override
    public String toString() {
        return "Sprint{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }

    @Override
    public Sprint clone() {
        return new Sprint(this);
    }
}
