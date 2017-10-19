package com.ucu.assignments.assignment1.heroesgame;

import java.util.Random;

public class King extends Character {

    public King() {
        this.setHp(new Random().nextInt(10) + 5);
        this.setAlive(true);
        this.setPower(new  Random().nextInt(10) + 5);
        this.setName("KING");
    }

    public void kick(Character enemy) {
        int attackPower;
        if (getPower() == 5) {
            attackPower = 5;
        } else {
            attackPower = new Random().nextInt(this.getPower() - 5) + 5;
        }
        System.out.printf("\n%s is attacking %s with attack damage: %d",this.getName(), enemy.getName(), attackPower);

        enemy.setHp(enemy.getHp() - attackPower);
        if (enemy.getHp() <= 0) {
            enemy.setAlive(false);
        }
    }
}
