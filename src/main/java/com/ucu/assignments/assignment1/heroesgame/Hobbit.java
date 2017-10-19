package com.ucu.assignments.assignment1.heroesgame;

/**
 * Created by bolshanetskyi on 18.10.17.
 */
public class Hobbit extends Character {

    public Hobbit() {
        this.setHp(3);
        this.setAlive(true);
        this.setPower(0);
        this.setName("HOBBIT");
    }

    @Override
    public void kick(Character enemy) {
        toCry();
    }

    private void toCry() {
        System.out.printf("\nHOBBIT(crying): PLEASE DON'T HURT ME! I'M A SMALL HOBBIT!");
    }
}
