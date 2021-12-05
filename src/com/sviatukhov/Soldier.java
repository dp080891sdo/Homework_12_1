package com.sviatukhov;

public class Soldier {
    protected boolean shot;
    protected boolean action;

    public Soldier(boolean shot, boolean move) {
        this.shot = shot;
        this.action = move;
    }

    protected static void move() {
        System.out.println("Move move move!!!");
    }

    protected static void fire() {
        System.out.println("Fire in the hall!!!");
    }

    @Override
    public String toString() {
        return "Soldier{" +
                "shot=" + shot +
                ", action=" + action +
                '}';
    }
}
