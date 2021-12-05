package com.sviatukhov;

public class Fence {
    protected boolean action;
    protected boolean destroyed;

    public Fence(boolean action, boolean destroyed) {
        this.action = action;
        this.destroyed = destroyed;
    }

    @Override
    public String toString() {
        return "Fence{" +
                "action=" + action +
                ", destroyed=" + destroyed +
                '}';
    }
}
