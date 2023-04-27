package com.company.behavioral.strategy;

import java.util.List;

public class SandwichReceipt {
    private final String above;
    private final List<String> middle;
    private final String down;

    public SandwichReceipt(String above, List<String> middle, String down) {
        this.above = above;
        this.middle = middle;
        this.down = down;
    }

    public String getAbove() {
        return above;
    }

    public List<String> getMiddle() {
        return middle;
    }

    public String getDown() {
        return down;
    }
}
