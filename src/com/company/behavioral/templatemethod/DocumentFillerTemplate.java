package com.company.behavioral.templatemethod;

public abstract class DocumentFillerTemplate {
    public void createDocument() {
        fillHeader();
        fillBody();
        fillFooter();
        fillSignature();
        done();
    }

    private void done() {
        System.out.println("Im document!");
    }

    protected void fillSignature() {
    }

    protected abstract void fillFooter();

    protected abstract void fillBody();

    protected abstract void fillHeader();
}
