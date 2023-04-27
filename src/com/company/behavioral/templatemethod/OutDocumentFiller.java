package com.company.behavioral.templatemethod;

public class OutDocumentFiller extends DocumentFillerTemplate {
    @Override
    protected void fillFooter() {
        System.out.println("Out D Footer");
    }

    @Override
    protected void fillBody() {
        System.out.println("Out D Body");
    }

    @Override
    protected void fillHeader() {
        System.out.println("Out D Header");
    }

    @Override
    protected void fillSignature() {
        System.out.println("Out D Sign");
    }
}
