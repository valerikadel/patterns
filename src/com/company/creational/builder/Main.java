package com.company.creational.builder;

public class Main {
    public static void main(String[] args) {
        Director d = new Director();

        SmartPhoneBuilder smb = new SmartPhoneBuilder();
        d.createSmartPhone(smb);
        smb.id(1).name("iPhone").cameraSize(28);
        System.out.println(smb.build());


        HomePhoneBuilder hpb = new HomePhoneBuilder();
        d.createHomePhone(hpb);
        System.out.println(hpb.build());
    }
}
