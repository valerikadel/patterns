package com.company.behavioral.chainofresponsibility;

public abstract class Handler {
    private Handler next;
    public Handler setNextHandler(Handler next) {
        this.next = next;
        return next;
    }
    public abstract boolean handle();
    protected boolean handleNext() {
        if (next == null) {
            return true;
        }
        return next.handle();
    }
}
