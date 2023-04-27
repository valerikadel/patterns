package com.company.structural.facade;

import java.util.Random;

public class SecondService {
    public void doRandomString(){
        Random r = new Random();
        for (int i =0;i<10;i++){
            StringBuilder sb = new StringBuilder();
            for (int j = 0;j<5;j++){
                int asciiCode = r.ints(0,255)
                        .findFirst()
                        .getAsInt();
                sb.append((char)asciiCode);
            }
            System.out.println(sb.toString());
        }
    }
}
