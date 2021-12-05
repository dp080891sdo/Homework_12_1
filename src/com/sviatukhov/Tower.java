package com.sviatukhov;

public class Tower extends Fence {
    public Tower(boolean action, boolean destroyed) {
        super(action, destroyed);
    }

    @Override
    public String toString() {
        return "Tower{" +
                "action=" + action +
                ", destroyed=" + destroyed +
                '}';
    }
}
