package com.ucu.assignments.assignment1.heroesgame;

import lombok.Data;

/**
 * Created by bolshanetskyi on 18.10.17.
 */
@Data
public abstract class Character {
    private int power;
    private int hp;
    private boolean isAlive;
    private String name;

    public abstract void kick(Character character);
}
