package com.company.creational.prototype;

public class ProjectA implements PrototypeProject {
    int id;
    String name;
    Sprint sprint;

    public ProjectA() {
    }

    public ProjectA(ProjectA a) {
        this.id = a.id;
        this.name = a.name;
        this.sprint = a.sprint.clone();
    }

    @Override
    public String toString() {
        return "ProjectA{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sprint=" + sprint.toString() +
                '}';
    }

    @Override
    public ProjectA clone() {
        return new ProjectA(this);
    }
}
