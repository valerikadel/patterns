package com.company.creational.prototype;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        ProjectA projectA1 = new ProjectA();
        projectA1.id = 1;
        projectA1.name = "name1";
        Sprint sprintProjectA1 = new Sprint();
        sprintProjectA1.date = LocalDate.MAX;
        sprintProjectA1.name = "sprint1";
        projectA1.sprint = sprintProjectA1;

        ProjectA projectCopy = projectA1.clone();

        projectA1.name="name2";
        projectA1.sprint.name="sprint2";
        System.out.println(projectA1);
        System.out.println(projectCopy);
    }
}
