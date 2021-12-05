package com.sviatukhov;

import java.util.ArrayList;

public class Main {
    /*
    1) Есть игра в которой клетчастое поле (например размером 10x10 клеток) и юниты, в одной клетке один юнит.
    Есть 4 типа юнитов: башня, забор, солдат и танк.
    Забор ничего не делает и может быть разрушен
    Башня ничего не делает и безсмертна
    Солдат стреляет и двигается - у него можно вызвать методы move() и fire()
    Танк умеет то же что и солдат, плюс еще у него есть метод reload()
    Создать классы которые соотвествует каждому юниту и использовать extends если это целесообразно.
    Может быть болльше классов чем перечилено в задаче если нужно.
    Создать список в котором есть юниты всех типов.
     */
    public static void main(String[] args) {

        Fence fence = new Fence(false, true);
        Fence fence2 = new Fence(false, false);
        Tower tower = new Tower(false, false);
        Soldier soldier = new Soldier(true, true);
        Tank tank = new Tank(true, true);
        Soldier.move();
        Soldier.fire();
        Tank.reload();
        Tank.move();
        Tank.fire();

        ArrayList<String> list = new ArrayList<>();
        list.add(String.valueOf(fence));
        list.add('\n' + String.valueOf(fence2));
        list.add('\n' + String.valueOf(tower));
        list.add('\n' + String.valueOf(soldier));
        list.add('\n' + String.valueOf(tank));
        System.out.println(list);

    }
}
