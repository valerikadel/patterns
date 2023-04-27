package com.company.behavioral.visitor;

public interface Visitor {
    void visitBank(BankVisiting bank);
    void visitBeach(BeachVisiting beach);
    void visitHome(HomeVisiting home);
    void visitSchool(SchoolVisiting school);
}
