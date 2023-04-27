package com.company.behavioral.strategy;

import com.company.behavioral.strategy.strategy.CheapSandwich;
import com.company.behavioral.strategy.strategy.ExpensiveSandwich;
import com.company.behavioral.strategy.strategy.StudentSandwich;

public class Main {
    public static void main(String[] args) {
        StudentSandwich studentSandwich = new StudentSandwich();
        SandwichService service = new SandwichService();
        service.setStrategy(studentSandwich);
        service.cook();

        service.setStrategy(new ExpensiveSandwich());
        service.cook();

        service.setStrategy(new CheapSandwich());
        service.cook();
    }
}
