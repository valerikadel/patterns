package com.company.behavioral.templatemethod;

public class InternalDocumentFiller extends DocumentFillerTemplate {
    @Override
    protected void fillFooter() {
        System.out.println("Internal D Footer");
    }
    @Override
    protected void fillBody() {
        System.out.println("Internal D Body");
    }
    @Override
    protected void fillHeader() {
        System.out.println("Internal D Header");
    }
}
