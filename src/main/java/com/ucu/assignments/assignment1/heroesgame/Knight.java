package com.ucu.assignments.assignment1.heroesgame;

import java.util.Random;

public class Knight extends Character {

    public Knight() {
        this.setHp(new Random().nextInt(10) + 2);
        this.setAlive(true);
        this.setPower(new Random().nextInt(10) + 2);
        this.setName("KNIGHT");
    }

    public void kick(Character enemy) {
        int attackPower;
        if (getPower() == 2) {
            attackPower = 2;
        } else {
            attackPower = new Random().nextInt(this.getPower() - 2) + 2;
        }
        System.out.printf("\n%s is attacking %s with attack damage: %d", this.getName(), enemy.getName(), attackPower);

        enemy.setHp(enemy.getHp() - attackPower); if (enemy.getHp() <= 0) {
            enemy.setAlive(false);
        }
    }
}
