package com.company.structural.facade;

import java.util.Random;

public class FirstService {
    public void doRandom() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println( random.nextInt());
        }
    }
}
