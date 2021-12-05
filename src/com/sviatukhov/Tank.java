package com.sviatukhov;

public class Tank extends Soldier {

    public Tank(boolean shot, boolean move) {
        super(shot, move);
    }

    public static void reload() {
        System.out.println("The gun is reloaded");
    }

    @Override
    public String toString() {
        return "Tank{" +
                "shot=" + shot +
                ", action=" + action +
                '}';
    }
}