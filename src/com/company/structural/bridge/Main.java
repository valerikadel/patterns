package com.company.structural.bridge;

import com.company.structural.bridge.abstraction.Computer;
import com.company.structural.bridge.abstraction.Laptop;
import com.company.structural.bridge.abstraction.PKComputer;
import com.company.structural.bridge.abstraction.Smartphone;
import com.company.structural.bridge.implementation.Finger;
import com.company.structural.bridge.implementation.Mouse;
import com.company.structural.bridge.implementation.TouchPad;

public class Main {
    public static void main(String[] args) {
        Computer laptop = new Laptop(new TouchPad());
        laptop.moveControl();

        Computer smartphone = new Smartphone(new Finger());
        smartphone.moveControl();

        Computer pk = new PKComputer(new Mouse());
        pk.moveControl();
    }
}
