package com.ucu.assignments.assignment1.heroesgame;

public class Elf extends Character {

    public Elf() {
        this.setHp(10);
        this.setAlive(true);
        this.setPower(10);
        this.setName("ELF");
    }

    @Override
    public void kick(Character enemy) {
        if (enemy.getPower() < this.getPower()) {
            enemy.setAlive(false);
            enemy.setHp(0);
            System.out.printf("\nELF is killing %s with on precises attack", enemy.getName());
        } else {
            System.out.printf("\n%s's power decreased by one", enemy.getName());
            enemy.setPower(enemy.getPower() - 1);
        }
    }
}
